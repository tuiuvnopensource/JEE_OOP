<%@ page import="jp.ivs.model.*" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sách nhân viên</title>
  </head>
  <body>
  <%
    DBNhanVien dbNhanVien = new DBNhanVien();
    ArrayList list = (ArrayList) dbNhanVien.getDsNhanVien();
    int leng = list.size();
  %>
    <table colspan = "center" border="1">
      <tr><td>Mã nhân viên</td><td>Tên nhân viên</td></tr>
      <%
        for (int i=0; i<leng; i++)
        {
          NhanVien nv = (NhanVien) list.get(i);
          out.print("<tr><td>" + nv.getMaNV() + "</td><td>"
             + nv.getTenNV() + "</td></tr>");
        }
      %>
    </table>

  </body>
</html>
