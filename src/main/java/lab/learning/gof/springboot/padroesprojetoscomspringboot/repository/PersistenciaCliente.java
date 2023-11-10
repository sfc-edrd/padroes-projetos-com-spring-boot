package lab.learning.gof.springboot.padroesprojetoscomspringboot.repository;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Cliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersistenciaCliente extends JpaRepository<Cliente, Long> { }
