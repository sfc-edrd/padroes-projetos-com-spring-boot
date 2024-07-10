package lab.learning.gof.service;

import lab.learning.gof.model.Cliente;

public interface IClienteService
{
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    Cliente atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
