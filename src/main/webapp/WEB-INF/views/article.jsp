<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel">
	<h2>
		<c:out value="${article.titre}" />
	</h2>
	<hr>
	<p class="text-justify">
		${article.text}
	</p>
	<hr>
	<p style="margin-bottom: 3rem;">
		<i>written on : <c:out value="${article.date}" /></i>
		<i class="fi-social-twitter right" style="font-size: 40px;margin: 10px;"></i>
	</p>
	<p>
	<a class="button left" href="<%=request.getContextPath() %>/articles">Back</a>
	<a class="button right" href="<%=request.getContextPath() %>/edit/article/${article.id}"><i class="fi-pencil">&nbsp;Edit</i></a>
	</p>
	<br/>
	<br/>
	
</div>
