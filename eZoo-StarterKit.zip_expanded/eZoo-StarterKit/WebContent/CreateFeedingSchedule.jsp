	<!-- Header -->
	<jsp:include page="header.jsp" />
	
	<!-- JSTL includes -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
	
<!-- 	Just some stuff you need -->
	<header>
	  <div class="container">
	  
	<c:choose>
	<c:when test="${not empty message }">
	  <p class="alert ${messageClass}">${message }</p>
	<%
	  session.setAttribute("message", null);
	  session.setAttribute("messageClass", null);
	%>
	</c:when>
	</c:choose>
	
		<h1>eZoo <small>Create Feeding Schedule</small></h1>
		<hr class="paw-primary">
		
		<form action="addFeedingSchedule" method="post" class="form-horizontal">
		
		  <div class="form-group">
		    <label for="scheudleID" class="col-sm-4 control-label">Schedule ID</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="scheduleID" name="scheduleID" placeholder="ScheduleID" required="required"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="feedingTime" class="col-sm-4 control-label">Feeding Time</label>
		    <div class="col-sm-4">
			  <input type="text" class="form-control" id="feedingTime" name="feedingTime" placeholder="FeedingTime" required="required"/>
		    </div>
		    </div>
		  <div class="form-group">
		    <label for="recurrence" class="col-sm-4 control-label">Recurrence</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="recurrence" name="recurrence" placeholder="Recurrence" required="required"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="class" class="col-sm-4 control-label">Food</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="food" name="food" placeholder="Food" required="required"/>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="phylum" class="col-sm-4 control-label">Notes</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="notes" name="notes" placeholder="notes" required="required"/>
		    </div>
		  </div>

		    
		  <div class="form-group">
		    <div class="col-sm-offset-4 col-sm-1">
		      <button type="submit" class="btn btn-primary">Add</button>
		    </div>
		  </div>
		</form>
	  </div>
	</header>


	<!-- Footer -->
	<jsp:include page="footer.jsp" />