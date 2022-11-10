function abrirNavegador() {
    document.querySelector(".contenedor-modal").style.visibility = "visible";
    document.querySelector(".contenedor-modal").style.opacity = "1";
    document.querySelector(".modal-navegacontenedor").style.transform="translateY(-200%)";
}

function cerrarVentana() {
    document.querySelector(".modal-navegacontenedor").style.transform="translateY(-300%)";
    document.querySelector(".contenedor-modal").style.opacity = "0";
    document.querySelector(".contenedor-modal").style.transition = "2s";
    document.querySelector(".contenedor-modal").style.visibility = "hidden";
}
function producto(){
    window.location.href="./Productos.jsp";
}

