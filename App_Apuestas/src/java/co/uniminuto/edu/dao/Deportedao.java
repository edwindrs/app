/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.dao;

import co.uniminuto.edu.pojos.Deporte;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EdwinDavid
 */
public class Deportedao {

    public void crearDeporte(Deporte D) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(D);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Deporte> verDeportes() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Deporte");
        List<Deporte> lista = query.list();
        session.close();
        return lista;
    }

    public String consultaDeporte(Integer iddeporte) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Deporte d = (Deporte) session.get(Deporte.class, iddeporte);
        session.close();
        return d.getDeporte();
    }
}
