/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.dao;

import co.uniminuto.edu.modelo.Modelo;
import co.uniminuto.edu.pojos.Partido;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EdwinDavid
 */
public class Partidodao {

    public void crearPartido(Partido P) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(P);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Partido> verPartidos() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Partido order by fecha");
        List<Partido> lista = query.list();
        session.close();
        return lista;
    }

    public List<Partido> verPartidosActualizar() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Partido where resultado = 'pendiente' order by fecha");
        List<Partido> lista = query.list();
        session.close();
        return lista;
    }

    public List<Partido> verPartidosApostar() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Date date = new Date();
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String fecha = datef.format(date) + ":00";
        Query query = session.createQuery("from Partido where fecha >= '" + fecha + "' order by fecha");
        List<Partido> lista = query.list();
        return lista;
    }

    public Partido consultaPartido(int idpartido) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Partido p = (Partido) session.get(Partido.class, idpartido);
        session.close();
        return p;
    }

    public void actualizarResultado(int idpartido, String resultado) {
        Modelo md = new Modelo();
        Partido p = consultaPartido(idpartido);
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            p.setResultado(resultado);
            session.update(p);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
        md.modelo();
    }
}
