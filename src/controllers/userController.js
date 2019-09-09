'use strict'

var bcrypt = require(bcrypt-nodejs);
var User = require('../models/user');

/* function funcion(req,res){
    res.status(200).send({
        message: ''
    });
} */

function registerUser(req,res){
    var user = new User();
    
    var params = req.body;
    user.name = params.name;
    user.surname = params.surname;
    user.email = params.email;
    user.password = params.password;
    // falta realizar la asignacion desde otro perfil pero de inicio vendra como natural
    // Como nombre de los roles dejemos : ROLE_NATURAL, ROLE_ADMIN
    user.role = 'ROLE_NATURAL';

    if(params.password){
        // parte de incriptacion de contraseña
        bcrypt.hash(params.password,null,null, function(err, hash){
            user.password = hash;
            if(user.name != null && user.surname != null && user.email != null){
                // pasar a guardar el usuario
                user.save((err,userStored) => {
                    if(err){
                        res.status(500).send({message: 'Error al intentar guardar usuario'});
                    }
                    else{
                        if(!userStored){
                            res.status(404).send({message: 'No se a registrado el usuario'})
                        }
                        else{
                            res.status(200).send({user: userStored});
                        }
                    }
                })
            }
            else{
                res.status(400).send({message: 'Introduce todos los campos'});
            }
        });
    }
    else{
        res.status(400).send({message: 'Introduce una contraseña'});
    }

}