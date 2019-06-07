/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.GenericDAO;
import Model.DAO.connectionHibernate;
import Model.VO.Cargo;
import Model.VO.Cliente;
import Model.VO.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jece Xavier
 */
public class Principal {
    public static void main(String[] args) {
        
        /*Cliente cli = new Cliente();
        cli.setNome("Precoceee");
        cli.setCPF("852.251.543-66");
        cli.setRG("50.577.111-99");
        */
        
        Cargo c = new Cargo();
        c.setCescricao("Professor");
        
        Funcionario f = new Funcionario();
        f.setCPF("123.122.456-55");
        f.setCargo(c);
        f.setEndereco("Rua Argentina...");
        f.setFone("6666-7070");
        f.setNome("Lucas Vidotto");
        f.setRG("50.005.541-5");
        
        
        
        //GenericDAO<Cargo> genericDAOcargo = new GenericDAO<Cargo>();
        GenericDAO<Funcionario> genericDAOFun = new GenericDAO<Funcionario>();
        
        //genericDAOcargo.salvar(c);
        genericDAOFun.salvar(f);
        
        connectionHibernate.close();
        
        /*EntityManagerFactory factory = Persistence.createEntityManagerFactory("POOII.utfpr_RevisaoMapeamento_jar_1.0-SNAPSHOTPU");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin(); //Adiciona na tabela
        manager.persist(c);
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();*/
        
        
        
    }
}
