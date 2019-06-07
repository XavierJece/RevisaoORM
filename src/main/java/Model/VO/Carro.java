package Model.VO;

import java.io.Serializable;
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
@Table(name = "tb_marca")
public class Carro implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tipocarro", nullable = false, foreignKey = @ForeignKey(name = "tipocarro_fk"))
    private TipoCarro tipocarro;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "marca", nullable = false, foreignKey = @ForeignKey(name = "marca_fk"))
    private Marca marca;

    @Column(nullable = true)
    private String placa;

    @Column(nullable = false)
    private String descricao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoCarro getTipocarro() {
        return tipocarro;
    }

    public void setTipocarro(TipoCarro tipocarro) {
        this.tipocarro = tipocarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Carro() {
    }

    public Carro(Long codigo, Marca marca, TipoCarro tipocarro, String placa, String descricao) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipocarro = tipocarro;
        this.placa = placa;
        this.descricao = descricao;
    }
}
