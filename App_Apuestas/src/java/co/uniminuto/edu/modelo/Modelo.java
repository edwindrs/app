/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.modelo;

import co.uniminuto.edu.dao.Apuestadao;
import co.uniminuto.edu.dao.Partidodao;
import co.uniminuto.edu.dao.Usuariodao;
import co.uniminuto.edu.pojos.Apuesta;
import java.util.List;

/**
 *
 * @author EdwinDavid
 */
public class Modelo {

    Apuestadao daoap = new Apuestadao();
    Partidodao daopar = new Partidodao();
    Usuariodao daousr = new Usuariodao();
    List<Apuesta> apuestas = daoap.verApuestasPago();

    public void modelo() {
        for (Apuesta a : apuestas) {
            if (daopar.consultaPartido(a.getPartidoIdpartido()).getResultado().equals(a.getApuesta())) {
                daousr.sumarSaldo(a.getUsuarioIdusuario(), (a.getValor() * 2));
                daoap.actualizarApuesta(a.getIdApuesta());
            } 
        }
    }
}
