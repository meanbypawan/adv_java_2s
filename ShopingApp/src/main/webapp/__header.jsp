<%
  Object isLoggedIn = session.getAttribute("isLoggedIn");
%>
<header class="bg-dark d-flex align-items-center justify-content-between" style="height:60px;">
      <div id="logo" class="h-100 d-flex flex-column justify-content-center align-items-center" style="width:15%; height:60px; box-size: border-box;">
         <span class="text-white" style="font-size:20px;"><strong class="text-danger">E-</strong>shop</span>
         <span class="text-warning">Shopping at single click</span>
      </div>
      <div id="search-input" class="h-100 d-flex justify-content-center align-items-center" style="width:60%">
         <input type="text" placeholder="Search product by name|title" class="form-control"/>
      </div>
      <div id="option" style="width:20%;" class="h-100 text-white d-flex justify-content-center align-items-center">
        <% if(isLoggedIn==null){%>
        <a href="signin.jsp">
          <span class="mr-2" style="cursor:pointer;">Sign-In</span>
        </a>
        <a href="signup.jsp">
         <span class="ml-2" style="cursor:pointer;">Sign-Up</span>
        </a>
        <%} else{%>
         <a href="controller/signout.jsp">
            <button class="btn btn-primary">Sign out</button>
        </a>
        <%} %>
      </div>
</header>