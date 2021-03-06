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
 
		<h1>eZoo <small>Feeding Schedule</small></h1>
		<hr class="paw-primary">
		<table class="table table-striped table-hover table-responsive ezoo-datatable">
			<thead>
				<tr>
					<th class="text-center">Schedule ID</th>
					<th class="text-center">Feeding Time</th>
					<th class="text-center">Recurrence</th>
					<th class="text-center">Food</th>
					<th class="text-center">Notes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="FEEDING_SCHEDULE" items="${FEEDING_SCHEDULE}">
					<tr>
						<td><c:out value="${FEEDING_SCHEDULE.scheduleID}" /></td>
						
						<td><c:out value="${FEEDING_SCHEDULE.scheduleID}" /></td>
						<td><c:out value="${FEEDING_SCHEDULE.feedingTime}" /></td>
						<td><c:out value="${FEEDING_SCHEDULE.recurrence}" /></td>
						<td><c:out value="${FEEDING_SCHEDULE.food}" /></td>
						<td><c:out value="${FEEDING_SCHEDULE.notes}" /></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>	

	  </div>
	</header>


	<!-- Footer -->
	<jsp:include page="footer.jsp" />