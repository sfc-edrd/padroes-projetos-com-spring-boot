package lab.learning.gof.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany
    private Endereco endereco;
}
