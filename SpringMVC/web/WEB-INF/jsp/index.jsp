<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Inicio de la página</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-light" href="agregar.htm">Nuevo Registro</a> 
                </div>

                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRES</th>
                                <th>CORREO</th>
                                <th>NACIONALIDAD</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td>${dato.id}</td>
                                    <td>${dato.nombres}</td>
                                    <td>${dato.correo}</td>
                                    <td>${dato.nacionalidad}</td>
                                    <td>
                                        <a href="modificar.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                                        <a href="eliminar.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>


            </div>

        </div>
    </body>
</html>
