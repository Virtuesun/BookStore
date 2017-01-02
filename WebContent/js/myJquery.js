$(document).ready(function(){

																	//首页


	// 点击登录弹出对话框
	$("#login-btn").click(function(){
		$("#login-box").css("left","0px");
		$(".mask").fadeIn();
	})

	// 点击mask退出对话框
	$(".mask").click(function(){
		$("#login-box").css("left","-300px");
		$(".mask").fadeOut();
		$(".username,.password").val("");
	})

	//返回顶部
	$(".back-to-top").click(function(){
		$("html,body").animate({
			scrollTop:0},800)
	})

	//返回顶部按钮消失
	$(window).scroll(function(){
		if($(window).scrollTop() > $(window).height())
			$(".back-to-top").fadeIn();
		else
			$(".back-to-top").fadeOut();
	})

	// Ajax验证用户和用户密码

	$(".submit").click(function(){

		var request = new XMLHttpRequest();

		//获取用户栏内容
		var username = document.getElementsByName("username");
		request.open("GET","LoginServlet.java?username="+username);
		request.send();
		request.onredystatechange = function(){
			if (request.readyState === 4) {
				if (request.status === 200) {
					null;
				}else{
					document.getElementsByName("username-err").innerHTML = request.responseText;
				}
			}
		}
	})


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






	//用户登录显示个人信息
	$("#login-btn").mouseover(function(){
		var username = $("#login-btn").text();
		if(username == "登录"){
			
		}
	})

	
	$(".exit").click(function(){
		$("#login-btn").text("未登录");
	})

		//跳转库存管理判断
		$("#manage").click(function(){
			var root;
			if(1){
				
				return true;
			}
		})






																//上架
		// 上架提示
		$(".ok").click(function(){
			if(confirm("确认提交？")){
				
			}
		})
})