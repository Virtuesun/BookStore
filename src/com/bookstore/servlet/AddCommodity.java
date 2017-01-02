package com.bookstore.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.bookstore.biz.BookBiz;
import com.bookstore.biz.CommodityBiz;
import com.bookstore.biz.impl.BookBizImpl;
import com.bookstore.biz.impl.CommodityBizImpl;
import com.bookstore.entity.Book;
import com.bookstore.entity.Commodity;
import com.bookstore.entity.User;

@WebServlet("/Auth/AddCommodity.action")
public class AddCommodity extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("login");
		Book book = new Book();
		Commodity commodity = new Commodity();

		commodity.setId_seller(user.getId());

		// 上传文件的存储路径（服务器文件系统上的绝对文件路径）
		//String uploadFilePath = request.getSession().getServletContext().getRealPath("commodityImage/");
		String uploadFilePath = "D://BookStore/CommodityImage/";
		
		File uploadFile = new File(uploadFilePath);
		if (!uploadFile.exists()) {
			// 路径不存在创建
			uploadFile.mkdirs();
		}

		// 通过Arrays类的asList()方法创建固定长度的集合
		List<String> fileType = Arrays.asList("gif", "bmp", "jpg","png");
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		boolean success = true;

		try {
			// 解析form表单中所有文件
			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> iter = items.iterator();

			String fieldName = "";
			String fieldValue = "";

			while (iter.hasNext()) { // 依次处理每个文件
				FileItem item = (FileItem) iter.next();

				if (item.isFormField()) { // 普通表单字段
					fieldName = item.getFieldName(); // 表单字段的name属性值
					fieldValue = item.getString("UTF-8");// 表单字段的value值
					switch (fieldName) {
					case "bookName":
						book.setName(fieldValue);
						break;
					case "author":
						book.setAuthor(fieldValue);
						break;
					case "isbn":
						book.setIsbn(fieldValue);
						break;
					case "press":
						book.setPress(fieldValue);
						break;
					case "version":
						book.setVersion(fieldValue);
						break;
					case "pages":
						book.setPages(Integer.parseInt(fieldValue));
						break;
					case "words":
						book.setWords(Integer.parseInt(fieldValue));
						break;
					case "press_date":
						book.setPress_date(fieldValue);
						break;
					case "size":
						book.setSize(Integer.parseInt(fieldValue));
						break;
					case "paper":
						book.setPaper(fieldValue);
						break;
					case "categories":
						book.setCategories(fieldValue);
						break;
					case "price":
						commodity.setPrice(Double.parseDouble(fieldValue));
						break;
					case "number":
						commodity.setPrice(Double.parseDouble(fieldValue));
						break;
					case "title":
						commodity.setTitle(fieldValue);
						break;
					case "description":
						commodity.setDescription(fieldValue);
						break;
					default:
						break;
					}

				} else { // 文件表单字段

					String fileName = item.getName();
					if (fileName != null && !fileName.equals("")) {
						String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
						if (!fileType.contains(ext)) { // 判断文件类型是否在允许范围内
							System.err.println("上传失败，文件类型只能是gif、bmp、jpg ");
							success = false;
						} else {
							String newFileName = "pic" + System.currentTimeMillis() + "." + ext;
							File fullFile = new File(newFileName);
							File saveFile = new File(uploadFilePath, fullFile.getName());
							item.write(saveFile);
							commodity.setImage(uploadFilePath+newFileName);
						}
					} else {
						success = false;
					}
				}
			}
		} catch (Exception e) {
			success = false;
			e.printStackTrace();
		}

		if (success) {
			BookBiz bookBiz = new BookBizImpl();
			int id_book = bookBiz.insertAndReturnId(book);
			commodity.setId_book(id_book);
			commodity.setState("在架");
			CommodityBiz commodityBiz = new CommodityBizImpl();
			commodityBiz.insert(commodity);
			System.out.println(uploadFilePath );
			response.sendRedirect("../index.jsp");
		} else {
			request.setAttribute("message", "上架商品出错！");
			request.getRequestDispatcher("../grounding.jsp").forward(request, response);
		}

	}

}
