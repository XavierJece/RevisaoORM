/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.GenericDAO;
import Model.DAO.connectionHibernate;
import Model.VO.Cargo;
import Model.VO.Carro;
import Model.VO.Cliente;
import Model.VO.Funcionario;
import Model.VO.Marca;
import Model.VO.TipoCarro;
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
        c.setDescricao("Diretor");
        
        Funcionario f = new Funcionario();
        f.setCPF("545.825.000-66");
        f.setCargo(c);
        f.setEndereco("Rua Argentina...");
        f.setFone("25166-7070");
        f.setNome("Claudio 123 ");
        f.setRG("85.555.555-5");
        
        Marca marca = new Marca();
        marca.setDescricao("Volks");
        
        
        TipoCarro tipoCarro = new TipoCarro();
        tipoCarro.setDescricao("Popular");
        
        Carro carro = new Carro();
        carro.setMarca(marca);
        carro.setTipocarro(tipoCarro);
        carro.setPlaca("BAR");
        carro.setDescricao("Uma bosta");
        
        GenericDAO<Carro> genericDAOCarro = new GenericDAO<Carro>();
        //GenericDAO<Marca> genericDAOMarca = new GenericDAO<Marca>();
        //GenericDAO<TipoCarro> genericDAOTipoCarro = new GenericDAO<TipoCarro>();
                
        //GenericDAO<Cargo> genericDAOcargo = new GenericDAO<Cargo>();
        //GenericDAO<Funcionario> genericDAOFun = new GenericDAO<Funcionario>();
        
        //genericDAOcargo.salvar(c);
        //genericDAOMarca.salvar(marca);
        genericDAOCarro.salvar(carro);
        //genericDAOTipoCarro.salvar(tipoCarro);
        
        /*List<Cargo> cargos;
        
        cargos = (List<Cargo> ) (genericDAOcargo.listTodos(c.getClass()));
        
        c = genericDAOcargo.listUm("codigo", 3L, c.getClass());
        System.out.println("Cargo de id = "+  c.getCodigo() + " e de nome = " + c.getDescricao());
        */
                
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
