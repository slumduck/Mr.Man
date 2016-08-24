$(function(){
	$("#login-box").find("button").on("click",function(){
		var flag = loginOrRegisterOrRetrieve.login();
		if(flag){
			$("#login-box").find("form").submit();
		}
	});
});
/**
 * login-box > form
 * placeholder:Username
 * placeholder:Password
 * 登录
 */
var loginOrRegisterOrRetrieve = {
		login:function(){
			var userName = $("#login-box").find("input[placeholder=Username]").val();
			var passWord = $("#login-box").find("input[placeholder=Password]").val();
			if(userName == "" || passWord == ""){
				alert("用户名或密码不能为空！");
				return false;
			}else{
				return true;
			}
		}
}
