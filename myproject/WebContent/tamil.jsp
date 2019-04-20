<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("userid")==null){
	response.sendRedirect("login.html");
}
%>
 <div style="position: fixed">
<div style="background-color:#E64836; height:160px;position:fixed;width:100%;top:0px;left:0px">
<img src="logo.png" alt="logo" style="position:absolute; width:100px; height:88px">
        <h1 style="margin-left: 100px;"><p><span style="color: darkgrey">M</span>ix</p></h1>
       <table style="background-color:darkgray;width: 50%;margin-left: 300px;margin-top: 56px;border-collapse: collapse" border="1">
       <tr><th><a href="home.html" target="_blank" onmouseover="overlink(this)" onmouseout="outoflink(this)">Home</a></th>
           <th><a href="about.html" target="_blank" onmouseover="overlink(this)" onmouseout="outoflink(this)">About us</a></th>

           </tr></table>
    </div>
    <div style="margin-top: 150px; width:15%;height:1000px;position: fixed;background-color:#E64836;left:0px">
    <table style="border-collapse:collapse;width:15%;height: 300px;background-color: darkgray;position: fixed;" border="1">
    <tr><th>Language:</th></tr>
    <tr><th styling="padding:8px"><a href="english.html">English</a></th></tr>
    <tr><th styling="padding:8px"><a href="hindi.html">Hindi</a></th></tr>
    <tr><th styling="padding:8px"><a href="telugu.html">Telugu</a></th></tr>
    <tr><th styling="padding:8px"><a href="tamil.html">Tamil</a></th></tr>    
    <tr><th styling="padding:8px"><form action="logout" method="post"><input type="submit" value="logout"></th></tr>
    </table>
    </div>    
        <div style="margin-left: 20%;margin-top: 175px;position: fixed"><a href="justin.html" target="_blank"><img src=vikramvedha.jpg style="width: 200px;height:200px;"><p>Vikram Vedha</p></a></div>
    </div>
    <div style="margin-left: 40%;margin-top: 175px;position: fixed"><a href="Kaththi.html" target="_blank"><img src=Kaththi.jpg style="width: 200px;height:200px;"><p>Kaththi</p></a></div>
    <div style="margin-left: 60%;margin-top: 175px;position: fixed"><a href="Vivegam.html" target="_blank"><img src=vivegam.jpg style="width: 200px;height:200px;"><p>Vivegam</p></a></div>
    <div style="margin-left: 80%;margin-top: 175px;position: fixed"><a href="Kabali.html" target="_blank"><img src=kabali.png style="width: 200px;height:200px;"><p>Kabali</p></a></div>
    <div style="margin-left: 20%;margin-top: 450px;position: fixed"><a href="Meesaya_Murukku.html" target="_blank"><img src=Meesaya_Murukku.jpg style="width: 200px;height:200px;"><p>Meesaya Murukku</p></a></div>

</body>
</html>