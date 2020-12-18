<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <div class="container">
        <form action="${pageContext.request.contextPath}/signIn">
            <button type="submit" class="btn btn-primary btn-lg btn-block">Sign In</button>
        </form>
        <form action="${pageContext.request.contextPath}/signUp">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Sign Up</button>
        </form>
        <form action="${pageContext.request.contextPath}/home" method="get">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Skip</button>
        </form>

    </div>
</tags:master>