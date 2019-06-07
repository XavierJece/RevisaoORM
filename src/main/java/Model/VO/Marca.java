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
@Table(name = "tb_marca")
public class Marca {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(nullable = false)
    private String Descricao;
    
    @OneToMany(mappedBy = "marca", orphanRemoval = false, cascade = CascadeType.ALL)
    private List<Carro> carro;

    public List<Carro> getCarro() {
        return carro;
    }

    public void setCarro(List<Carro> carro) {
        this.carro = carro;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Marca() {
    }

    public Marca(Long codigo, String Descricao) {
        this.codigo = codigo;
        this.Descricao = Descricao;
    }
}
