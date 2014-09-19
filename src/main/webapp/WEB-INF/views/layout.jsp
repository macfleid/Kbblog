<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link href="css/foundation.min.css" rel="stylesheet" type="text/css"> -->

<link href="<c:url value="/css/foundation.min.css" />" rel="stylesheet"  type="text/css" />  
<link href="<c:url value="/css/kbb.css" />" rel="stylesheet"  type="text/css" />  
<link href="<c:url value="/css/normalize.css" />" rel="stylesheet"  type="text/css" />  
<link href="<c:url value="/css/foundation-icons.css" />" rel="stylesheet"  type="text/css" />  

<link rel="shortcut icon" href="<c:url value="/img/fav.ico" />" type="image/x-icon">
<link rel="icon" href="<c:url value="/img/fav.ico" />" type="image/x-icon">

<%-- <script type="text/javascript" src="<c:url value="/js/modernizr.js" />"></script> --%>
<title>Mcfly dev board</title>
</head>
<body>
	<tiles:insertAttribute name="menu" />
	<div>
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />
	
	<script type="text/javascript" src="<c:url value="/js/vendor/jquery.js" />"></script>
	<script src="<c:url value="/js/vendor/fastclick.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/foundation.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/bbcode.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/bbcode_.js" />"></script>
	<script>
		$(document).foundation();
	
		$(document).ready(function() {
// 			$('#bbcode').markItUp(myBbcodeSettings);

// 			$('#emoticons li a').click(function() {
// 				emoticon = $(this).attr("title");
// 				$.markItUp({
// 					replaceWith : emoticon
// 				});
// 			});
		});
	</script>

</body>
</html>