package lab.learning.gof.springboot.padroesprojetoscomspringboot.controller;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Cliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.service.IServicoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ApiCliente
{
    @Autowired
    private IServicoCliente servicoCliente;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Cliente> buscarTodos()
    {
        return servicoCliente.buscarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarPorId(@PathVariable ("id") Long id)
    {
        return servicoCliente.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente inserir(@RequestBody Cliente cliente)
    {
        return servicoCliente.inserir(cliente);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cliente atualizar(@PathVariable ("id") Long id,
                             @RequestBody Cliente cliente)
    {
        return servicoCliente.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id)
    {
        servicoCliente.deletar(id);
    }
}
