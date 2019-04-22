/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.ws;

import co.uniminuto.edu.dao.Apuestadao;
import co.uniminuto.edu.pojos.Apuesta;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EdwinDavid
 */
@WebService(serviceName = "apuestaws")
public class apuestaws {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearApuesta")
    public void crearApuesta(@WebParam(name = "apuesta") String apuesta, @WebParam(name = "valor") int valor, @WebParam(name = "fecha") String fecha, @WebParam(name = "estado") byte estado, @WebParam(name = "idusuario") int idusuario, @WebParam(name = "idpartido") int idpartido) {
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Apuesta a = new Apuesta();
        Apuestadao dao = new Apuestadao();
        a.setApuesta(apuesta);
        a.setEstado(estado);
        try {
            a.setFecha(datef.parse(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(apuestaws.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setPartidoIdpartido(idpartido);
        a.setUsuarioIdusuario(idusuario);
        a.setValor(valor);
        dao.crearApuesta(a);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verApuestas")
    public List<Apuesta> verApuestas() {
        Apuestadao dao = new Apuestadao();
        List<Apuesta> apuestas = dao.verApuestas();
        return apuestas;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verApuestasPago")
    public List<Apuesta> verApuestasPago() {
        Apuestadao dao = new Apuestadao();
        List<Apuesta> apuestas = dao.verApuestasPago();
        return apuestas;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verApuestasUsuario")
    public List<Apuesta> verApuestasUsuario(@WebParam(name = "usuarioIdusuario") int usuarioIdusuario) {
        Apuestadao dao = new Apuestadao();
        List<Apuesta> apuestas = dao.verApuestasUsuario(usuarioIdusuario);
        return apuestas;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaApuesta")
    public Apuesta consultaApuesta(@WebParam(name = "idApuesta") int idApuesta) {
        Apuestadao dao = new Apuestadao();
        return dao.consultaApuesta(idApuesta);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarApuesta")
    public void actualizarApuesta(@WebParam(name = "idApuesta") int idApuesta) {
        Apuestadao daoap = new Apuestadao();
        daoap.actualizarApuesta(idApuesta);
    }
    
}
