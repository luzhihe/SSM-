<%--
  Created by IntelliJ IDEA.
  User: hrym13
  Date: 2018/3/28
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录管理</title>
    <jsp:include page="public.jsp"></jsp:include>
    <script src="http://api.asilu.com/cdn/jquery.js,jquery.backstretch.min.js" type="text/javascript"></script>
</head>
<style>
    .form{
        margin-left: 35%;
        margin-top: 10%;
        width: 30%;
    }
    label{
        margin-left: 1rem;
        margin-top: 1rem;
    }
    body {
        width: 90%;
        margin: 2rem auto;
        background-color: #FFF;
        padding: 2rem;
        opacity: 0.7;
        line-height: 1.5em;
        font-size: 1rem;
    }
    button{
        margin-top: 0.5rem;
        line-height: 1.5rem;
    }
</style>
<body>

    <form class="form" action="/home/getLogin">
        <div class="form-group">
            <label for="text">登录名:</label>
            <input type="text" class="form-control" name="userName" id="text" placeholder="Name">
        </div>
        <div class="form-group">
            <label for="pwd">密码:</label>
            <input type="password" name="password" class="form-control" id="pwd" placeholder=" password">
        </div>
        <div class="form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox">记住我
            </label>
        </div>
        <button type="submit" class="btn btn-primary form-control">登录</button>
    </form>

</body>
<script type="text/javascript">
    $.backstretch([
        'http://api.asilu.com/cdn/img/bg/444.jpg',
        'http://api.asilu.com/cdn/img/bg/445.jpg',
        'http://api.asilu.com/cdn/img/bg/446.jpg',
        'http://api.asilu.com/cdn/img/bg/447.jpg',
        'http://api.asilu.com/cdn/img/bg/448.jpg'
    ], {
        fade : 1000, // 动画时长
        duration : 2000 // 切换延时
    });
</script>
</html>
