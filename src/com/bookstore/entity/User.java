package com.bookstore.entity;

public class User {
	//注册时填写
	private int id; // 用户id
	private String role;// 用户角色
	private String username; // 用户名
	private String showname; // 显示名
	private String password; // 密码
	
	//个人资料填写
	private String sex;// 性别
	private int age;// 年龄
	private String email; // 邮箱
	private String phone; //电话号码
	private String address;//地址

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", username=" + username + ", showname=" + showname + ", password="
				+ password + ", sex=" + sex + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}
	

}
