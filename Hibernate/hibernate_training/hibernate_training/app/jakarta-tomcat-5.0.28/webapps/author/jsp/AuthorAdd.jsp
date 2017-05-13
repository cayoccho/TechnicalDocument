<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@ page import="com.author.data.*, com.author.dao.*" %>
<%@ page import="java.util.*" %>
<%
try{
	
	Person p = new Person();
	Author auth = new Author();
	Work w = new Work();
	AuthorDao adao = new AuthorDao();
	
	p.setPersonName(request.getParameter("pname"));
	
	auth.setPerson(p);
	auth.setNickName(request.getParameter("nname"));

	w.setWorkName(request.getParameter("wname"));
	Set s = new HashSet();
	s.add(w);
	auth.setWork(s);
	adao.create(auth);
}
catch(Exception e){
	e.printStackTrace();
%>
	<jsp:forward page="failure.jsp"/>
<%
}
%>
	<jsp:forward page="success.jsp"/>
