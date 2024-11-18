<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <h3 class="card-header">Category</h3>  
        <ul class="list-group list-group-flush">
            <%
                ArrayList<ChuDe> dsChuDe = (ArrayList<ChuDe>)request.getAttribute("dsChuDe");
                for(ChuDe c: dsChuDe)
                {
            %>
            
            <li class="list-group-item"> <a href="san-pham?macd=<%=c.getMacd() %>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i> <%=c.getTencd() %> </a> </li>
            <%
                }
            %>
        </ul>   
</div>
