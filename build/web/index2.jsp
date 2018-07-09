<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    
    <div class="container">
        
    <form action="/create-user" method="post">
        <div class="form-row">
          <div class="col">
            <input type="text" name="username" class="form-control" placeholder="Username">
          </div>
          <div class="col">
            <input type="password" name="password" class="form-control" placeholder="Password">
          </div>
        </div>
        <button type="submit" class="btn btn-primary">Sign up</button>
    </form>
    

    <%
        List<User> users = (List<User>)request.getAttribute("users");
        if (users.size() > 0) {
    %>
    
    <table class="table">
      <thead>
        <tr>
          <th scope="col">Id</th>
          <th scope="col">Username</th>
          <th scope="col">password</th>
        </tr>
      </thead>
      <tbody>
        <%for (User user: users) {%>
        <tr>
          <th scope="row"><%=user.getId()%></th>
          <td><%=user.getUsername().get()%></td>
          <td><%=user.getPassword().get()%></td>
        </tr>
        <%}%>
      </tbody>
    </table>

    <%
        }
    %>
    
    </div>
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
