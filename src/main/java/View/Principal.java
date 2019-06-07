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
import java.util.List;
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
        f.setCPF("666.666.000-66");
        f.setCargo(c);
        f.setEndereco("Rua Argentina...");
        f.setFone("6666-7070");
        f.setNome("Vitoria Aladim ");
        f.setRG("85.666.666-5");
        
        
        
        GenericDAO<Cargo> genericDAOcargo = new GenericDAO<Cargo>();
        //GenericDAO<Funcionario> genericDAOFun = new GenericDAO<Funcionario>();
        
        //genericDAOcargo.salvar(c);
        //genericDAOFun.salvar(f);
        
        List<Cargo> cargos;
        
        cargos = (List<Cargo> ) (genericDAOcargo.listTodos(c.getClass()));
        
        c = genericDAOcargo.listUm("codigo", 3L, c.getClass());
        System.out.println("Cargo de id = "+  c.getCodigo() + " e de nome = " + c.getCescricao());
        
                
        /*for (int i = 0; i < cargos.size(); i++) {
            System.out.println("Cargo de id = "+  cargos.get(i).getCodigo() + " e de nome = " + cargos.get(i).getCescricao());
        }*/
        
        //genericDAOcargo.deletar(cargos.get(1));
        
        //cargos.get(0).setCescricao("Doutor");
        
        //genericDAOcargo.atualizar(cargos.get(0));
        
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
