<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <div class="container">

            <form action="${pageContext.request.contextPath}/userDetails">
                <button type="submit" class="btn btn-primary btn-lg btn-block">User details</button>
            </form>
            <form action="${pageContext.request.contextPath}/planDetails/1">
                <button type="submit" class="btn btn-secondary btn-lg btn-block">My plan</button>
            </form>

    </div>
</tags:master>