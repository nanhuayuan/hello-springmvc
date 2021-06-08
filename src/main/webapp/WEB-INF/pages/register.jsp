<%--
  Created by IntelliJ IDEA.
  User: 76502
  Date: 2021/5/24
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>注册页面</h1>
    <form action="register1">
        用户名: <input name="name"> <br>
        生日: <input name="name"> <br>
        密码: <input name="birth" type="password"> <br>
        确认密码: <input name="repassword" type="datetime-local"> <br>
        <input type="submit">
    </form>
    <br>
    <form action="${pageContext.request.contextPath }/file/upload" method="post"
          enctype="multipart/form-data">
        file: <input type="file" name="files"/> <br>
        <input type="submit" value="提交"/>
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/file/download?name=Koala.jpg">下载</a>
    <br>
    <img src="${pageContext.request.contextPath}/captcha" style="width:85px" id="cap"/>
    <br>
    用户名 : <input  id="userName" > <br>
    密码 : <input id="password">  <br>
    确认密码 : <input id="repassword"> <br>
    <button onclick="submit()">注册</button>
</body>

<script src="${pageContext.request.contextPath}/file/js/jquery.min.js"></script>
<script>

    function submit() {
        var userName = $("#userName").val();
        var password = $("#password").val();
        var repassword = $("#repassword").val();

        $.ajax({
            url:"register",
            type: "post",
            data:{"name":userName,"password":password},
            dataType: "json",
            success: function(data){
                if (data.code == 1) {
                    location.href = "toLogin";
                }else{
                    alert(data.message)
                }
            }
        })
    }

    $(function(){
        $("#cap").click(function(){
            //刷新验证码
            path = $(this).attr("src")+"?"+new Date().getTime();
            $(this).attr("src",path);
        });
    });

</script>


</html>
