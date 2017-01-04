$(document).ready(function(){

																	//首页
//点击617store返回最初
	$(".index").click(function(){
		$(".nav-box").css("display","block");
	});

	// 点击登录弹出对话框
	$("#login-btn").click(function(){
		$("#login-box").css("left","0px");
		$(".mask").fadeIn();
	});

	// 点击mask退出对话框
	$(".mask").click(function(){
		$("#login-box").css("left","-300px");
		$(".mask").fadeOut();
		$(".username,.password").val("");
	});

	//返回顶部
	$(".back-to-top").click(function(){
		$("html,body").animate({
			scrollTop:0},800)
	});

	//返回顶部按钮消失
	$(window).scroll(function(){
		if($(window).scrollTop() > $(window).height())
			$(".back-to-top").fadeIn();
		else
			$(".back-to-top").fadeOut();
	});

	


//	查询
	$(".search-btn").click(function(){
		$(".nav-box").css("display","none");
		$.ajax({
        	type:"GET",
        	url:"http://localhost:8080/BookStore/SearchServlet.action?keywords="+$(".search-text").val(),
        	dataType:"json",
        	success:function(data){
        		
        		for(var i = 0; i<data.length;i++){
        			$(".search-box").append("<div class='row'><div class='col-md-3'><img src='"+data[i].image+"'/><h1>￥"+data[i].price+"</h1><p>"+data[i].title+"</p></div></div>")
        			//<div class='row'><div class='col-md-3'><img src='"+data[i].image+"'/><h1>￥"+data[i].price+"</h1><p>"+data[i].title+"</p></div>
        			
        		}	
        	}
        });
	});
		
	
	
	$.ajax({
    	type:"GET",
    	url:"http://localhost:8080/BookStore/GetAllCommotidyServlet.action",
    	dataType:"json",
    	success:function(data){
    		for(var i = 0; i<data.length;i++){
    			$(".manageTable").append("<tr><td><img src='"+data[i].image+"'></td><td>"+data[i].bookName+"</td><td>$"+data[i].price+"</td><td>"+data[i].number+"</td></tr>");
    		}	
    	}
    });


	//注册
		//点击保存，弹出提示框
//		$(".save").click(function(){
//			if(confirm("确认提交？")){
//				alert("提交成功！");
//			}
//		})
//
//
//		$(".email").blur(function(){
//			var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
//  			var email = $(".email").val();
//  			if(email == ''){
//  				$(".email").css("border-color","red");
//  			}
//		});
//












})