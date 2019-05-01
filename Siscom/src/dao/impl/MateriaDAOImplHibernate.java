/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.MateriaDAO;
import java.util.List;
import modelo.Materia;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author TICLAB4
 */
public class MateriaDAOImplHibernate extends 
        GenericDAOImplHibernate<Materia, Integer> implements MateriaDAO {
    public List<Materia> lgin (String nombre){
        
        String select = "from Materia where nombre = '"+nombre+"'";
                Session sesion=sessionFactory.getCurrentSession();
                sesion.beginTransaction();
                Query query=sesion.createQuery(select);
                List<Materia> lista = query.list();
                sesion.close();
                return lista;
    }
  
}
