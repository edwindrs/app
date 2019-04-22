/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.ws;

import co.uniminuto.edu.dao.Deportedao;
import co.uniminuto.edu.pojos.Deporte;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EdwinDavid
 */
@WebService(serviceName = "deportews")
public class deportews {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearDeporte")
    @Oneway
    public void crearDeporte(@WebParam(name = "deporte") String deporte) {
        Deporte u = new Deporte();
        Deportedao dao = new Deportedao();
        u.setDeporte(deporte);
        dao.crearDeporte(u);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verDeportes")
    public List<Deporte> verDeportes() {
        Deportedao dao = new Deportedao();
        List<Deporte> lista = dao.verDeportes();
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultaDeporte")
    public String consultaDeporte(@WebParam(name = "iddeporte") int iddeporte) {
        Deportedao dao = new Deportedao();
        return dao.consultaDeporte(iddeporte);
    }
}
