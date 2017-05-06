<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<%
 if(session == null || session.getAttribute("user")== null){
%>
<a href="login.jsp"></a>
<%} %>
<div class="container-fluid">
	<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="home.jsp">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#profile">User's Home</a></li>
      <li><a href="#p1">Activities</a></li>
      <li><a href="#p2">Blogs</a></li>
      <li><a href="#p3">Page 3</a></li>
      
      <li class="dropdown">
	    <a class="dropdown-toggle" data-toggle="dropdown" href="#"><label>Hi,<%=session.getAttribute("userName")%></label>
	    <span class="caret"></span></a>
	    <ul class="dropdown-menu">
	      <li><a href="#">Settings</a></li>
	      <li><form action="logout" id="logoutForm"><button type="submit" class="btn btn-primary form-control">Logout</button></form></li> 
	    </ul>
 	 </li>
    </ul>
  </div>
</nav>
	<div id="profile">
		<jsp:include page="profile.jsp" />  
	</div>
	<div id="p1">
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view. 
	</div>
	<div id="p2">
	<h5>p2</h5>
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view. 
	</div>
	<div id="p3">
		<h5>p3</h5>
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view.
		ARTICLE is a celebration of all things British, covering everything from art and design to culture, 
		entertainment and contemporary men's fashion. Published twice a year, we aim to share the things 
		that we think makes Britain great from an independent, individual point of view. 
	</div>
</div>
</body>
</html>
