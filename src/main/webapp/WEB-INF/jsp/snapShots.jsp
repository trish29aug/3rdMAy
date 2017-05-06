<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/fasahion.jpg" var="fash" />

<div class="container">
  <h2>Snaps</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value='/src/main/webapp/Snaps/download.jpg'/>" alt="Los Angeles" width=500px height=500px>
      </div>

      <div class="item">
        <img src="<%= request.getContextPath() %>/src/main/webapp/Snaps/fasahion.jpg" alt="Chicago" width=400px height=400px>
      </div>
    
      <div class="item">
        <img src="/resources/nigerian-bloggers.jpg" alt="New york" width=400px height=100px>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

