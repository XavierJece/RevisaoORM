/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jece Xavier
 */
public class GenericDAO<T> implements iGenereicDAO<T>{

    EntityManager manager;
    
    
    public GenericDAO(){
        manager = connectionHibernate.getInstance();
    }
    
    @Override
    public void salvar(T objeto) {
        manager.getTransaction().begin();
        manager.persist(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public T listUm(String pkName, Long pkValue, Class clazz) {
        String jpql = "SELECT t FROM " + clazz.getTypeName() + " t WHERE " + pkName + " = " + pkValue;
        Query query = this.manager.createQuery(jpql);
        Object obj = query.getSingleResult();
        return (T) obj;
    }

    @Override
    public List listTodos(Class clazz) {
        String jpql = "SELECT t FROM " + clazz.getTypeName() + " t";
        Query query = manager.createQuery(jpql); 
        List<T> obj = query.getResultList();
        return obj;
    }

    @Override
    public void atualizar(T  objeto) {
        manager.getTransaction().begin();
        manager.merge(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public void deletar(T objeto){
       manager.getTransaction().begin();
       manager.remove(objeto);
       manager.getTransaction().commit();
    }
    
}
