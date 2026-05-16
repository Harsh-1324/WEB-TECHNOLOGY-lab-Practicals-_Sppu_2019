import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class EbookServlet extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse res)
throws IOException {

res.setContentType("text/html");
PrintWriter out = res.getWriter();

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test","root","");

Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from ebookshop");

while(rs.next()){
out.println(rs.getInt(1)+" "+rs.getString(2)+"<br>");
}
}catch(Exception e){
out.println(e);
}
}
}