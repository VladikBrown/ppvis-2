<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <div class="container">

        <form action="${pageContext.request.contextPath}/planList">
            <button type="submit" class="btn btn-primary btn-lg btn-block">Select new</button>
        </form>
        <form action="${pageContext.request.contextPath}/update">
            <button type="button" class="btn btn-secondary btn-lg btn-block">Update</button>
        </form>
        <form action="${pageContext.request.contextPath}/planCreation">
            <button type="submit" class="btn btn-secondary btn-lg btn-block">Create plan</button>
        </form>

    </div>
</tags:master>