package Model.VO;

public class TipoCarro {

    private Long codigo;

    private String Descricao;

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

    public TipoCarro() {
    }

    public TipoCarro(Long codigo, String Descricao) {
        this.codigo = codigo;
        this.Descricao = Descricao;
    }
}
