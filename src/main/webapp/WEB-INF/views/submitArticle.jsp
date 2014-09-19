<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form modelAttribute="article" method="POST" action="/kblog/submit/article/save">
	<div class="row" style="margin-top: 1em;">
	<h2>Submit article</h2>
	<hr>
	</div>
	<div class="row">
		<div class="large-12 columns">
			<label>Title<form:input type="text" placeholder="text" path="titre"/>
			</label>
		</div>
	</div>
	<div class="row">
    <div class="large-12 columns">
    <label>Select categorie
        <form:select path="categorie.id">
    		<c:forEach  items="${listCategories}" var="e">
    			<form:option value="${e.id}" label="${e.name}"/>
    		</c:forEach>
    	</form:select>
      </label>
    </div>
  </div>
	<div class="row" style="margin-top: 1em;">
		<div class="large-12 columns">
			<ul class="tabs" data-tab="">
				<li class="tab-title active"><a href="#panel2-1">Edit text</a></li>
				<li class="tab-title"><a href="#panel2-2" id="renderButton">Render</a></li>
			</ul>
			<div class="tabs-content">
				<div class="content active" id="panel2-1">
					<ul class="inline-list" id="emoticons">
						<li><a href="#" class="small"  title=":("><i class="fi-bold"></i></a></li>
						<li><a href="#" class="small"><i class="fi-italic"></i></a></li>
						<li><a href="#" class="small"><i class="fi-underline"></i></a></li>
						<li><a href="#" class="small"><i class="fi-list-bullet"></i></a></li>
						<li><a href="#" class="small"><i class="fi-photo"></i></a></li>
						<li><a href="#" class="small">Code</a></li>
					</ul>
					<form:textarea rows="20" placeholder="text" path="text" id="bbcode"></form:textarea>
				</div>
				<div class="content" id="panel2-2">
					<p>Second panel content goes here...</p>
				</div>
			</div>
		</div>
	</div>
	
	<div class="row" style="margin-top: 1em;">
		<div class="large-12 columns">
		<ul class="button-group right">
			<li><a class="button center small">Cancel</a></li>
			<li>
				<button class="button small center" type="submit">Submit</button>
			</li>
		</ul>
		</div>
	</div>
	
	<form:input type="hidden" placeholder="text" path="id" />

</form:form>