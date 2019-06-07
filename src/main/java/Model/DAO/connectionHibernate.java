/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jece Xavier
 */
public class connectionHibernate {
    private static EntityManagerFactory factory;
    private static EntityManager manager;
    
     private connectionHibernate(){ }
     
     public static EntityManager getInstance(){
        if (manager == null){
            synchronized (connectionHibernate.class){
                if (manager == null){
                factory = Persistence.createEntityManagerFactory("POOII.utfpr_RevisaoMapeamento_jar_1.0-SNAPSHOTPU");
                manager = factory.createEntityManager();
                }
            }
        }
        return manager;
    }
    
    public static void close(){
        manager.close();
        factory.close();
    }
    
}
