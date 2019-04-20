<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body style="background:lightgray">
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("userid")==null){
	response.sendRedirect("login.html");
}
%>
<div style="position:fixed;">
   <div style="background-color: #E64836; height:160px; position: fixed;width:100%;top:0px;left:0px">
 <img src="logo.png" alt="logo" style="position:absolute; width:100px; height:88px">
        <h1 style="margin-left: 100px;"><p><i><span style="color: darkgrey">M</span>ix</i></p></h1>
       <table style="background-color:darkgray;width: 50%;margin-left: 300px;margin-top: 56px;border-collapse: collapse" border="1">
       <tr><th onmouseover="over(this)" onmouseout="out(this)"><a href="home.html" target="_blank">Home</a></th>
           <th><a href="about.html" target="_blank" onmouseover="overlink(this)" onmouseout="outoflink(this)">About us</a></th>
           
           </tr></table>
    </div>
    <div style="margin-top: 150px; width:15%;height:1000px;position: fixed;background-color: #E64836;left:0px">
    <table style="border-collapse:collapse;width:15%;height: 300px;background-color: darkgray;position: fixed;" border="1">
    <tr><th>Language:</th></tr>
    <tr><th styling="padding:8px" onmouseover="over(this)" onmouseout="out(this)"><a href="english.jsp">English</a></th></tr>
    <tr><th styling="padding:8px" onmouseover="over(this)" onmouseout="out(this)"><a href="hindi.jsp">Hindi</a></th></tr>
    <tr><th styling="padding:8px" onmouseover="over(this)" onmouseout="out(this)"><a href="telugu.jsp">Telugu</a></th></tr>   
    <tr><th styling="padding:8px"><form action="logout" method="post"><input type="submit" value="logout"></th></tr>
    </table>
    </div>    
    </div>
    <script>
    function over(obj){
        obj.style.backgroundColor="#6C6769";
    }
        function out(obj){
            obj.style.backgroundColor="darkgray";
        }
    </script>
</body>
</html>