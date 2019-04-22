/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.edu.dao;

import co.uniminuto.edu.pojos.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EdwinDavid
 */
public class Usuariodao {

    public void crearUsuario(Usuario U) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(U);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> verUsuarios() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Usuario");
        List<Usuario> lista = query.list();
        session.close();
        return lista;
    }

    public Usuario consultaUsuario(int idusuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Usuario u = (Usuario) session.get(Usuario.class, idusuario);
        session.close();
        return u;
    }

    public Integer consultaSaldo(int idusuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Usuario u = (Usuario) session.get(Usuario.class, idusuario);
        session.close();
        return u.getSaldo();
    }

    public void restarSaldo(int idusuario, Integer apuesta) {
        Usuario u = consultaUsuario(idusuario);
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            u.setSaldo(u.getSaldo() - apuesta);
            session.update(u);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public void sumarSaldo(int idusuario, Integer valor) {
        Usuario u = consultaUsuario(idusuario);
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            u.setSaldo(u.getSaldo() + valor);
            session.update(u);
            tx.commit();
            session.close();
        } catch (Exception e) {
            tx.rollback();
            throw new RuntimeException(e);
        }
    }
}
