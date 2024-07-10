package lab.learning.gof.repository;


import lab.learning.gof.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> { }
