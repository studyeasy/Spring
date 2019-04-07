<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h2>Add/Update product </h2>
<hr/>
	<form:form action="${pageContext.request.contextPath}/addProduct" method="post" modelAttribute="product">
	     <form:hidden path="productID"/>
		<p />Product Name : <p />
		<form:input path="productName" />
		<p />Cost : <p />
		<form:input path="cost" />
		<p />
		<input type="submit" value="Add/Update Product">
	</form:form>
<hr/>
<a href="${pageContext.request.contextPath}/">Homepage</a>


