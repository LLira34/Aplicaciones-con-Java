/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.GrupoDAO;
import java.util.Date;
import java.util.List;
import modelo.Grupo;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Daniel Aguilar
 */
public class GrupoDAOImplHibernate extends
        GenericDAOImplHibernate<Grupo, Integer> implements GrupoDAO{
    
    public List<Grupo> login (String nombre, Date fecha_inicio, Date fecha_fin){
        
        String select="from Grupo where nombre='"+nombre+"'"+" and "+
                "fecha_inicio='"+fecha_inicio+"'"+" and "+
                "fecha_fin='"+fecha_fin+"'";
        
        Session sesion=sessionFactory.getCurrentSession();
        sesion.beginTransaction();
        Query query=sesion.createQuery(select);
        List<Grupo> lista=query.list();
        sesion.close();
        return lista;
    }
}
