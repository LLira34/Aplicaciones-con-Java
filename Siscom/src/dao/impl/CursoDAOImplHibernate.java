/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CursoDAO;
import java.util.List;
import modelo.Curso;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author migue
 */
public class CursoDAOImplHibernate extends GenericDAOImplHibernate<Curso, Integer> implements CursoDAO{
    
    public List<Curso> login (String nombre){
        
        String select="from Curso where nombre='"+nombre+"'";
        
        Session sesion=sessionFactory.getCurrentSession();
        sesion.beginTransaction();
        Query query=sesion.createQuery(select);
        List<Curso> lista=query.list();
        sesion.close();
        return lista;
    }
    
    
}
