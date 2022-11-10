<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/12f3bc59b2.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>PRODUCTOS</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">

            <a class="navbar-brand" href="#">Productos del dia</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="ControladorProductos?accion=home">Home</a>
                    </li>
                    <li class="nav-item">
                        <div class="container">
                            <select class="form-select" aria-label="Seleccione las opciones">
                                <option selected>Open this select menu</option>
                                <option value="1">Gatos</option>
                                <option value="2">Perros</option>
                                <option value="3">Otros</option>
                            </select>
                        </div>
                    </li>
                    <li class="nav-item">
                        <div class="container">
                            <select class="form-select" aria-label="Seleccione las opciones">
                                <option selected>Open this select menu</option>
                                <option value="1">Juguetes</option>
                                <option value="2">Comidas</option>
                                <option value="3">Baños</option>
                            </select>
                        </div>
                    </li>
                </ul>

                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                <ul>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            nombre usuario
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Cambiar datos</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Cerrar </a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-3">
        <div class="row">
            <c:forEach var="p" items="${productos}">
                <div class="col-sm-4">
                    <div class="card text-center">
                        <div class="card-header bg-dark text-white">
                            <label>${p.getNombres()}</label>;
                        </div>
                        <div class="card-body">
                            <img src="ControladorIMGProducto?id=${p.getId()}" width="200" height="180"/>
                        </div>
                        <div class="card-footer bg-dark text-white">
                            <p>Precio del Producto</p>
                            <i>${p.getPrecio()}</i> <br>

                            <div>
                                <a href="url" class="btn btn-light">Agregar a mi Compra</a>
                                <a href="url" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>
