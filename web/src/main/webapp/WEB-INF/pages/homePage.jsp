<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <div class="container">
        <div>
            <h1>Home</h1>
        </div>

        <form action="${pageContext.request.contextPath}/userHome">
            <button type="submit" class="btn btn-primary btn-lg btn-block">PrivateSpace</button>
        </form>
        <form action="${pageContext.request.contextPath}/shop">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Shop</button>
        </form>
        <form action="${pageContext.request.contextPath}/welcomePage">
            <button type="button" class="btn btn-secondary btn-lg btn-block">back</button>
        </form>
    </div>
</tags:master>