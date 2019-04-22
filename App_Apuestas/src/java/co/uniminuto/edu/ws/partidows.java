/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.ws;

import co.uniminuto.edu.dao.Partidodao;
import co.uniminuto.edu.pojos.Partido;
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
@WebService(serviceName = "partidows")
public class partidows {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearPartido")
    public void crearPartido(@WebParam(name = "fecha") String fecha, @WebParam(name = "resultado") String resultado, @WebParam(name = "local") int local, @WebParam(name = "visita") int visita) {
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Partido p = new Partido();
        Partidodao dao = new Partidodao();
        try {
            p.setFecha(datef.parse(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(partidows.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setEquipoIdequipo(local);
        p.setEquipoIdequipo1(visita);
        p.setResultado(resultado);
        dao.crearPartido(p);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verPartidos")
    public List<Partido> verPartidos() {
        Partidodao dao = new Partidodao();
        List<Partido> lista = dao.verPartidos();
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verPartidosActualizar")
    public List<Partido> verPartidosActualizar() {
        Partidodao dao = new Partidodao();
        List<Partido> lista = dao.verPartidosActualizar();
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verPartidosApostar")
    public List<Partido> verPartidosApostar() {
        Partidodao dao = new Partidodao();
        List<Partido> lista = dao.verPartidosApostar();
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaPartido")
    public Partido consultaPartido(int idpartido) {
        Partidodao dao = new Partidodao();
        Partido p = dao.consultaPartido(idpartido);
        return p;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarResultado")
    public void actualizarResultado(int idpartido, String resultado) {
        Partidodao dao = new Partidodao();
        dao.actualizarResultado(idpartido, resultado);

    }
}
