package lab.learning.gof.repository;

import ch.qos.logback.core.net.server.Client;
import lab.learning.gof.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> { }
