package Model.VO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cargo", nullable = true, foreignKey = @ForeignKey(name = "cargo_fk"))
    private Cargo cargo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String RG;

    @Column(nullable = false)
    private String CPF;

    @Column(nullable = false)
    private String fone;

    @Column(nullable = false)
    private String endereco;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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

    public Funcionario() {
    }

    public Funcionario(Long codigo, Cargo cargo, String nome, String CPF, String fone, String endereco) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.nome = nome;
        this.CPF = CPF;
        this.fone = fone;
        this.endereco = endereco;
    }
}
