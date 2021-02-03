<%-- 
    Document   : editar
    Created on : 30 ene 2021, 22:03:43
    Author     : FIGTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar cliente</title>
        
        <%@include file="../components/assets.jsp" %>
        
    </head>
    <body>
          <div class="container">
            <h1 class="text-center mb-2"><span class="fas fa-file-alt"></span> Modificar Registro</h1>
            <hr>
            <form action="/crudJavaEE/cliente?action=modificar" method="Post">
                <div class="form-group ">
                    <label class=" text-rigth" for="id">ID:</label>
                    <input required value="${item.getId()}"  id="id" class="form-control " type="text" name="id"  readonly="readonly">     
                </div>
                <div class="form-group ">
                    <label class=" text-rigth" for="nombre">Nombre:</label>
                    <input value="${item.getNombre()}" required  id="nombre" class="form-control " type="text" name="nombre" placeholder="Digite sus nombres...">     
                </div>
                <div class="form-group ">
                    <label class=" text-rigth" for="direccion">Direccion:</label>
                    <textarea required="" name="direccion" cols="3" rows="5" class="form-control" placeholder="digite su direccion">${item.getDireccion()}
                    </textarea>
                </div>
                <div class="form-group ">
                    <label class=" text-rigth" for="dui">Dui:</label>
                    <input value="${item.getDui()}"  required  id="dui" class="form-control " type="number" name="dui" placeholder="Digite su DUI...">     
                </div>
                <div class="form-group ">
                    <label class=" text-rigth" for="telefono">Telefono:</label>
                    <input value="${item.getTelefono()}" required="" id="telefono" class="form-control " type="number" name="telefono" placeholder="Digite su telefono...">   
                </div>
                 <div class="form-group ">
                    <label class=" text-rigth" for="email">Correo Electronico:</label>
                   <input value="${item.getEmail()}" required="" id="email" class="form-control " type="email" name="email" placeholder="Digite su correo electronico...">   
               
                </div>
                <div class="row mb-2">
                    <button class="btn btn-success  col-2 ml-2 " type="submit"><span class="fas fa-save"></span> Guardar</button>
                    <a class="btn btn-danger col-2 ml-2" href="/crudJavaEE/cliente"><span class="fas fa-ban"></span> Cancelar</a>
                </div>
            </form>
        </div>
    </body>
</html>
