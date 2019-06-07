package Model.VO;

import java.time.LocalDate;

public class Locacao {

    private Long codigo;

    private Carro carro;

    private Cliente cliente;

    private LocalDate dataLocacao;

    private LocalDate dataEntrega;

    private Double valor;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Locacao() {
    }

    public Locacao(Long codigo, Carro carro, Cliente cliente, LocalDate dataLocacao, LocalDate dataEntrega, Double valor) {
        this.codigo = codigo;
        this.carro = carro;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
    }
}
