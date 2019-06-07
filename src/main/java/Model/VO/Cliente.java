package Model.VO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Criar uam tabela no banco
@Entity

@Table(name = "tb_cliente")


public class Cliente {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String RG;
    
    @Column(nullable = false)
    private String CPF;

    @Column(nullable = true)
    private String fone;
    
    @Column(nullable = true)
    private String endereco;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente() {
    }

    public Cliente(Long codigo, String nome, String RG, String CPF, String fone, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.fone = fone;
        this.endereco = endereco;
    }
    
    public Cliente(String nome, String RG, String CPF) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }
}
