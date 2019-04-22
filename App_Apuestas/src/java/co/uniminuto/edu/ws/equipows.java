/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.ws;

import co.uniminuto.edu.dao.Equipodao;
import co.uniminuto.edu.pojos.Equipo;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EdwinDavid
 */
@WebService(serviceName = "equipows")
public class equipows {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearEquipo")
    @Oneway
    public void crearEquipo(@WebParam(name = "equipo") String equipo, @WebParam(name = "iddeporte") int iddeporte) {
        Equipo e = new Equipo(equipo, iddeporte);
        Equipodao dao = new Equipodao();
        dao.crearEquipo(e);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verEquipos")
    public List<Equipo> verEquipos() {
        Equipodao daoe = new Equipodao();
        List<Equipo> equipos = daoe.verEquipos();
        return equipos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarEquipo")
    public String consultarEquipo(@WebParam(name = "idequipo") int idequipo) {
        Equipodao dao = new Equipodao();
        return dao.consultaEquipo(idequipo);
    }
}
