<nav class="top-bar" data-topbar>
  <ul class="title-area">
    <li class="name">
      <h1><a href="<%=request.getContextPath() %>/articles">Dev board</a></h1>
    </li>

     <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
    <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
  </ul>

  <section class="top-bar-section">
    <!-- Right Nav Section -->
    <ul class="right">
      <li class="has-dropdown">
        <a href="#">Admin</a>
        <ul class="dropdown">
          <li><a href="<%=request.getContextPath() %>/submit/article">Submit article</a></li>
        </ul>
      </li>
    </ul>

    <!-- Left Nav Section -->
    <ul class="left">
      <li class="divider"></li>
      <li><a href="<%=request.getContextPath() %>/articles/android">Android</a></li>
      <li class="divider"></li>
      <li><a href="<%=request.getContextPath() %>/articles/spring">Spring</a></li>
      <li class="divider"></li>
      <li><a href="<%=request.getContextPath() %>/articles/sqlite">Sqlite</a></li>
      <li class="divider"></li>
      <li><a href="<%=request.getContextPath() %>/articles/java">Java</a></li>
      <li class="divider"></li>
    </ul>
  </section>
</nav>