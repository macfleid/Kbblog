<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row  no-margin">
	<div class="large-10 columns">
		<c:forEach items="${listArticle}" var="e">
			<div class="kbbpanel_article_list row">
				<div class="medium-1 large-1 text-center columns">
					<c:if test="${e.categorie.name=='android'}">
						<img src="<%=request.getContextPath() %>/img/android_icon.png" width="100%" height="100%">
					</c:if>
					<c:if test="${e.categorie.name=='spring'}">
						<img src="<%=request.getContextPath() %>/img/spring_icon.png" width="100%" height="100%">
					</c:if>
					<c:if test="${e.categorie.name=='sqlite'}">
						<img src="<%=request.getContextPath() %>/img/sqlite_icon.png" width="100%" height="100%">
					</c:if>
				</div>
				<div class="medium-11 large-11 columns">
					<span><a
						href="<%=request.getContextPath() %>/article/<c:out value="${e.id}" />">
							<c:out value="${e.titre}" />
					</a> </span><br /> <span style="font-size: small;">written on : <c:out
							value="${e.date}" /></span><br />
				</div>
			</div>
			<hr>
		</c:forEach>

		<div class="pagination-centered">
			<ul class="pagination">
				<li class="arrow unavailable"><a href="">&laquo;</a></li>
				<c:forEach var="i" begin="0" end="${pageCount-1}">
					<li <c:if test="${page==i}">
							 class="current"
						</c:if> >
						<a href="?page=<c:out value="${i}"/>"><c:out value="${i+1}" /></a>
					</li>
				</c:forEach>
				<li class="arrow"><a href="">&raquo;</a></li>
			</ul>
		</div>
	</div>

	<div class="panel large-2 columns">
		<h3>#Tags</h3>
		
	</div>
	
	<div class="off-canvas-wrap" data-offcanvas>
		<div class="inner-wrap">
			<section class="middle tab-bar-section">
				<h1 class="title">Foundation</h1>
			</section>
		</div>
		</div>

</div>