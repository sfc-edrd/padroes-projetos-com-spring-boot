package lab.learning.gof.springboot.padroesprojetoscomspringboot.model;

import jakarta.persistence.*;

@Entity
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Cliente() {}

    public Cliente(String nome, Endereco endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
