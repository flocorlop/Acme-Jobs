<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.request_.form.label.title" path="title"/>
	<acme:form-textbox code="authenticated.request_.form.label.moment" path="moment"/>
	<acme:form-textbox code="authenticated.request_.form.label.dateLimit" path="dateLimit"/>
	<acme:form-textarea code="authenticated.request_.form.label.text" path="text"/>
	<acme:form-textarea code="authenticated.request_.form.label.money" path="money"/>
	<acme:form-textarea code="authenticated.request_.form.label.ticker" path="ticker"/>

	<acme:form-return code="authenticated.request_.form.button.return"/>
	</acme:form> 

