
<%-- 
    Document   : index
    Created on : 29 ene 2021, 11:04:43
    Author     : FIGTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaEE</title>
        
        <%@include file="../components/assets.jsp" %>
    </head>
    <body>
        
        <div class="container">
            <h1>LISTADO DE CLIENTES</h1>
        
            <a href="cliente?action=nuevo"  class="btn btn-primary mt-2"><span class="fas fa-plus"></span> Nuevo</a> <br><br>

            <table class="table">

                 <thead>
                     <tr>
                         <th>ID</th>
                         <th>Nombre</th>
                         <th>Direccion</th>
                         <th>DUI</th>
                         <th>Telefono</th>
                         <th>Email</th>
                     </tr>
                 </thead>
                 <tbody>
                         <c:forEach var="item" items="${lista}">
                             <tr>
                                 <td><c:out value="${item.id}"/></td>
                                 <td><c:out value="${item.nombre}"/></td>
                                 <td><c:out value="${item.direccion}"/></td>
                                 <td><c:out value="${item.dui}"/></td>
                                 <td><c:out value="${item.telefono}"/></td>
                                 <td><c:out value="${item.email}"/></td>

                                 <td>
                                     <a class="btn btn-warning mt-1" href="/crudJavaEE/cliente?action=editar&id=<c:out value="${item.id}" />"><span class="fas fa-pen"></span></a>
                                     <a class="btn btn-danger mt-1" href="/crudJavaEE/cliente?action=eliminar&id=<c:out value="${item.id}"/>"><span class="fas fa-minus"></span></a>
                                 </td>				
                             </tr>
                         </c:forEach>

                 </tbody>
             </table>

        </div>
       
    </body>
</html>
