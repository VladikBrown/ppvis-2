<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:master pageTitle="Add item">
    <div class="container">
        <form action="${pageContext.request.contextPath}/signUp">
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text">Login</span>
                </div>
                <input type="text" class="form-control" aria-label="Sizing example input"
                       aria-describedby="inputGroup-sizing-default">

                <div class="input-group-prepend">
                    <span class="input-group-text">Password</span>
                </div>
                <input type="text" class="form-control" aria-label="Sizing example input"
                       aria-describedby="inputGroup-sizing-default">

            </div>

            <button type="button" class="btn btn-primary btn-lg btn-block">Sign In</button>
        </form>
    </div>
</tags:master>