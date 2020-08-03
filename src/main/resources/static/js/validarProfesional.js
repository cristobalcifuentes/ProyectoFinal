
(function(){

    var formulario = document.getElementsByName('formulario')[0],
    elementos = formulario.elements,
    boton = document.getElementById('boton');

    var validarProfesion = function(e) {
        if(formulario.profesion.value == 0){
            alert('Ingrese una Profesion');
            e.preventDefault();
        }else if(formulario.profesion.value.length > 30){
            alert('Ingrese un profesion menor o igual a 30 caracteres');
            e.preventDefault();
        }
    }
    var validarEmail = function(e) {
        if(formulario.email.value == 0){
            alert('Ingrese un Correo Electronico');
            e.preventDefault();
        }else if(formulario.email.value.length > 30){
            alert('Ingrese una Email menor o igual a 30 caracteres');
            e.preventDefault();
        }
    }
    
    

    var validar = function(e){
        validarEmail(e);
        validarProfesion(e);
    }


   formulario.addEventListener("submit",validar)

}())