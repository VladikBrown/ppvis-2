<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <form action="${pageContext.request.contextPath}/cart">
        <button type="submit" class="btn btn-primary btn-lg btn-block">Cart</button>
    </form>
    <form action="${pageContext.request.contextPath}/foodList">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Food shop</button>
    </form>
    <form action="${pageContext.request.contextPath}/recipeList" method="get">
        <button type="submit" class="btn btn-secondary btn-lg btn-block">Recipe shop</button>
    </form>
    <form action="${pageContext.request.contextPath}/home" method="get">
        <button type="button" class="btn btn-secondary btn-lg btn-block">Coffee shop 4:20</button>
    </form>
</tags:master>