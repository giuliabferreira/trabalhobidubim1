package br.com.etec.giulia.trabalhobidubim1.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomecliente;

    @OneToMany(mappedBy = "contasreceber")
    private List<ContasReceber> contasreceber = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public List<ContasReceber> getContasreceber() {
        return contasreceber;
    }

    public void setContasreceber(List<ContasReceber> contasreceber) {
        this.contasreceber = contasreceber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
