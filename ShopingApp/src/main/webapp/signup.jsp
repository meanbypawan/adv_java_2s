<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@include file="__bootstrap.jsp" %>
  <style>
    .form{
      width: 350px;
      height: auto;
      box-shadow: 10px 10px 10px grey;
    }
  </style>
</head>
<body>
  <div class="container d-flex justify-content-center align-items-center" style="height:100vh">
     <div class="form">
        <div class="bg-danger p-2 text-center text-white">SIGN IN HERE</div>
        <form method="post" action="./controller/sign-up-action.jsp" class="p-2">
          <div class="form-group">
             <input name="username" type="text" class="form-control" placeholder="Enter username"/>
          </div>
          <div class="form-group">
             <input name="email" type="text" class="form-control" placeholder="Enter email id"/>
          </div>
          <div class="form-group">
             <input name="password" type="password" class="form-control" placeholder="Enter password"/>
          </div>
          <div class="form-group">
             <input name="contact" type="text" class="form-control" placeholder="Enter contact number"/>
          </div>
          <div class="form-group">
            <button type="submit" class="btn btn-secondary" style="width:100%;">Sign Up</button>
          </div>
          <div class="form-group">
            <p class="text-center" style="cursor:pointer; color: blue;"><a href="signin.jsp">Alreay have account ?</a></p>
          </div>
        </form>
     </div>
  </div>
</body>
</html>