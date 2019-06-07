package Model.VO;

public class Marca {

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

    public Marca() {
    }

    public Marca(Long codigo, String Descricao) {
        this.codigo = codigo;
        this.Descricao = Descricao;
    }
}
