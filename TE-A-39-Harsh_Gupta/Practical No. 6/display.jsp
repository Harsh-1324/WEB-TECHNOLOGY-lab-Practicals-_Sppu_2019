<%@ page import="java.sql.*" %>

<%
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test","root","");

Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from students_info");

while(rs.next()){
out.println(rs.getInt(1)+" "+rs.getString(2)+"<br>");
}
%>