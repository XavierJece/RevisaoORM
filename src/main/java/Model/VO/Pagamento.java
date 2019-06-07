package Model.VO;

public class Pagamento {

    private Long codigo;

    private Locacao locacao;

    private Cliente cliente;

    private Double multa;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Pagamento() {
    }

    public Pagamento(Long codigo, Locacao locacao, Cliente cliente, Double multa) {
        this.codigo = codigo;
        this.locacao = locacao;
        this.cliente = cliente;
        this.multa = multa;
    }
}
