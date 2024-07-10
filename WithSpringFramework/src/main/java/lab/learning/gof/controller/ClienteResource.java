package lab.learning.gof.controller;

import lab.learning.gof.model.Cliente;
import lab.learning.gof.service.implementation.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteResource
{
    @Autowired
    private ClientServiceImpl service;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Cliente> buscarTodos()
    {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id)
    {
        return service.buscarPorId(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente inserir(@RequestBody Cliente cliente)
    {
        service.inserir(cliente);
        return cliente;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Cliente inserir(@PathVariable Long id,
                           @RequestBody Cliente cliente)
    {
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletar(@PathVariable Long id)
    {
        service.deletar(id);
        return ;
    }
}
