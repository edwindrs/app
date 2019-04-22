/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.ws;

import co.uniminuto.edu.dao.Usuariodao;
import co.uniminuto.edu.pojos.Usuario;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EdwinDavid
 */
@WebService(serviceName = "usuariows")
public class usuariows {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registro")
    public void registro(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "password") String password, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono, @WebParam(name = "correo") String correo) {
        Usuario u = new Usuario();
        Usuariodao dao = new Usuariodao();
        Byte rol = 1;
        int saldo = 5000;
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setIdusuario(idusuario);
        u.setPassword(password);
        u.setTelefono(telefono);
        u.setCorreo(correo);
        u.setSaldo(saldo);
        u.setRol(rol);
        dao.crearUsuario(u);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumarValor")
    @Oneway
    public void sumarValor(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "valor") Integer valor) {
        Usuariodao dao = new Usuariodao();
        dao.sumarSaldo(idusuario, valor);
    }

    @WebMethod(operationName = "restarValor")
    @Oneway
    public void restarValor(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "valor") Integer valor) {
        Usuariodao dao = new Usuariodao();
        dao.restarSaldo(idusuario, valor);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaUsuario")
    public Usuario consultaUsuario(@WebParam(name = "idusuario") int idusuario) {
        Usuariodao dao = new Usuariodao();
        Usuario u = dao.consultaUsuario(idusuario);
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaSaldo")
    public Integer consultaSaldo(@WebParam(name = "idusuario") int idusuario) {
        Usuariodao dao = new Usuariodao();
        return dao.consultaSaldo(idusuario);
    }
}
