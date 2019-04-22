/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.dao;

import co.uniminuto.edu.pojos.Apuesta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EdwinDavid
 */
public class Apuestadao {

    public void crearApuesta(Apuesta A) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(A);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Apuesta> verApuestas() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Apuesta order by fecha");
        List<Apuesta> lista = query.list();
        session.close();
        return lista;
    }

    public List<Apuesta> verApuestasUsuario(int usuarioIdusuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Apuesta where usuarioIdusuario = '" + usuarioIdusuario + "' order by fecha");
        List<Apuesta> lista = query.list();
        session.close();
        return lista;
    }

    public List<Apuesta> verApuestasPago() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Apuesta where estado = 0 order by fecha");
        List<Apuesta> lista = query.list();
        session.close();
        return lista;
    }

    public Apuesta consultaApuesta(int idApuesta) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Apuesta a = (Apuesta) session.get(Apuesta.class, idApuesta);
        session.close();
        return a;
    }

    public void actualizarApuesta(int idApuesta) {
        Apuesta a = consultaApuesta(idApuesta);
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            Byte b = 1;
            a.setEstado(b);
            session.update(a);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }

    }
}
