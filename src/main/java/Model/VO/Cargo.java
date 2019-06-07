package Model.VO;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cargo")
public class Cargo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(nullable = false, unique = true)
    private String descricao;
    
    @OneToMany(mappedBy = "cargo", orphanRemoval = false)
    private List<Funcionario> funcionarios;
    
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCescricao() {
        return descricao;
    }

    public void setCescricao(String cescricao) {
        this.descricao = cescricao;
    }

    public Cargo() {
    }

    public Cargo(Long codigo, String cescricao) {
        this.codigo = codigo;
        this.descricao = cescricao;
    }

}