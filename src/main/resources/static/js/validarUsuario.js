(function(){

    var formulario = document.getElementsByName('formulario')[0],
    elementos = formulario.elements,
    boton = document.getElementById('boton');

    var validarNombre = function(e) {
        if(formulario.nombre.value == 0){
            alert('Ingrese un nombre');
            e.preventDefault();
        }else if(formulario.nombre.value.length > 20){
            alert('Ingrese un nombre menor a 20 caracteres');
            e.preventDefault();
        }
    }
    var validarApellido = function(e) {
        if(formulario.apellido.value == 0){
            alert('Ingrese un apellido');
            e.preventDefault();
        }else if(formulario.apellido.value.length > 20){
            alert('Ingrese un apellido menor a 20 caracteres');
            e.preventDefault();
        }
    }
    var validarPassword = function(e) {
        if(formulario.password.value == 0){
            alert('Ingrese un password');
            e.preventDefault();
        }else if(formulario.password.value.length > 20){
            alert('Ingrese un password menor a 20 caracteres');
            e.preventDefault();
        }else if(formulario.password.value != formulario.pas.value ){
            alert('Los password no Coinciden');
            e.preventDefault();
        }
    }
    var validarLogin = function(e) {
        if(formulario.login.value == 0){
            alert('Ingrese un login');
            e.preventDefault();
        }else if(formulario.login.value.length > 20){
            alert('Ingrese un login menor a 20 caracteres');
            e.preventDefault();
        }
    }
    

    var validar = function(e){
        validarNombre(e);
        validarApellido(e);
        validarPassword(e);
        validarLogin(e);
    }


   formulario.addEventListener("submit",validar)

}())