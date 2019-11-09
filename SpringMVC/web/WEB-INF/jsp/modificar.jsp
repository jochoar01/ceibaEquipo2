<%-- 
    Document   : modificar
    Created on : 29-oct-2019, 20:24:42
    Author     : Sebas-AAMG
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Modificar</title>
    </head>
    <body>
        <div class="container mt-4 col col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar registro</h4> 
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombres</label>
                        <input type="text" name="nombre" class="form-control" value="${lista[0].nombres}">
                        <label>Correo</label>
                        <input type="text" name="correo" class="form-control" value="${lista[0].correo}">
                        <label>Nacionalidad</label>
                        <input type="text" name="nacionalidad" class="form-control" value="${lista[0].nacionalidad}">
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="index.htm" >Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
