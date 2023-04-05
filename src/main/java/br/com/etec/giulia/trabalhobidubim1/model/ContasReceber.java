package br.com.etec.giulia.trabalhobidubim1.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "contasreceber")
public class ContasReceber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date dataconta;
    private BigDecimal valorconta;


    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataconta() {
        return dataconta;
    }

    public void setDataconta(Date dataconta) {
        this.dataconta = dataconta;
    }

    public BigDecimal getValorconta() {
        return valorconta;
    }

    public void setValorconta(BigDecimal valorconta) {
        this.valorconta = valorconta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContasReceber that = (ContasReceber) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
