/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.dao;

import co.uniminuto.edu.pojos.Equipo;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EdwinDavid
 */
public class Equipodao {

    public void crearEquipo(Equipo E) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(E);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Equipo> verEquipos() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Equipo");
        List<Equipo> lista = query.list();
        session.close();
        return lista;
    }

    public String consultaEquipo(Integer idequipo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Equipo d = (Equipo) session.get(Equipo.class, idequipo);
        session.close();
        return d.getEquipo();
    }
}
