package Model.VO;

public class Carro {

    private Long codigo;

    private Marca marca;

    private TipoCarro tipocarro;

    private String placa;

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
