(function(){

    var formulario = document.getElementsByName('formulario')[0],
    elementos = formulario.elements,
    boton = document.getElementById('boton');

    var validarRazonSocial = function(e) {
        if(formulario.razon.value == 0){
            alert('Ingrese una Razon Social');
            e.preventDefault();
        }else if(formulario.razon.value.length > 100){
            alert('Ingrese un nombre menor o igual a 100 caracteres');
            e.preventDefault();
        }
    }
    var validarDireccion = function(e) {
        if(formulario.direccion.value == 0){
            alert('Ingrese un Direccion');
            e.preventDefault();
        }else if(formulario.direccion.value.length > 20){
            alert('Ingrese una Dirección menor o igual a 100 caracteres');
            e.preventDefault();
        }
    }
    var validarComuna = function(e) {
        if(formulario.comuna.value == 0){
            alert('Ingrese una Comuna');
            e.preventDefault();
        }else if(formulario.comuna.value.length > 20){
            alert('Ingrese una Comuna menor o igual a 100 caracteres');
            e.preventDefault();
        }
    }
    var validarTelefono = function(e) {
        if(formulario.telefono.value == 0){
            alert('Ingrese un telefono');
            e.preventDefault();
        }else if(formulario.telefono.value.length > 9){
            alert('Ingrese un Telefono menor o igual a 9 numeros');
            e.preventDefault();
        }
    }
    var validarEmail = function(e) {
        if(formulario.email.value == 0){
            alert('Ingrese un Email');
            e.preventDefault();
        }else if(formulario.email.value.length > 30){
            alert('Ingrese un Email menor o igual a 9 caracteres ');
            e.preventDefault();
        }
    }
    var validarActividadE = function(e) {
        if(formulario.economica.value == 0){
            alert('Ingrese una una Actividad');
            e.preventDefault();
        }else if(formulario.economica.value.length > 100){
            alert('Ingrese una Actividad menor o igual a 100 caracteres');
            e.preventDefault();
        }
    }
    var validarTipoEmpresa = function(e) {
        if(formulario.tipo.value == 0){
            alert('Ingrese Tipo de Empresa');
            e.preventDefault();
        }else if(formulario.tipo.value.length > 9){
            alert('Ingrese un Tipo de Empresa menor o igual a 100 caracteres');
            e.preventDefault();
        }
    }
    

    var validar = function(e){
        validarRazonSocial(e);
        validarDireccion(e);
        validarComuna(e);
        validarTelefono(e);
        validarEmail(e);
        validarActividadE(e);
        validarTipoEmpresa(e);
    }


   formulario.addEventListener("submit",validar)

}())