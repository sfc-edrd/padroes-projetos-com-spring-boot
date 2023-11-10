package lab.learning.gof.springboot.padroesprojetoscomspringboot.service;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.exception.RecursoNaoLocalizado;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Cliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IServicoCliente
{
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id) throws RecursoNaoLocalizado;

    Cliente inserir(Cliente cliente);

    Cliente atualizar(Long id, Cliente cliente) throws RecursoNaoLocalizado;

    void deletar(Long id) throws RecursoNaoLocalizado;
}
