package lab.learning.gof.springboot.padroesprojetoscomspringboot.service.implementation;

import jakarta.transaction.Transactional;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.exception.RecursoNaoLocalizado;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Cliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Endereco;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.repository.PersistenciaCliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.service.IServicoCliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.service.IServicoViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoClienteImpl implements IServicoCliente
{
    @Autowired
    private PersistenciaCliente persistenciaCliente;

//    @Autowired
//    private PersistenciaEndereco persistenciaEndereco;

    @Autowired
    private IServicoViaCep buscaEndereco;

    @Override
    public Iterable<Cliente> buscarTodos()
    {
        return persistenciaCliente.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) throws RecursoNaoLocalizado
    {
        return persistenciaCliente
                .findById(id)
                .orElseThrow(
                        () -> new RecursoNaoLocalizado(
                                "Cliente ID " + id + " não locaizado"));
    }

    @Override
//    @Transactional
    public Cliente inserir(Cliente cliente)
    {
        buscarCepEAtribuirEnderecoAoCliente(cliente);
        persistenciaCliente.save(cliente);
        return cliente;
    }

//    @Transactional
    @Override
    public Cliente atualizar(Long id, Cliente cliente) throws RecursoNaoLocalizado
    {

//         persistenciaCliente
//                .findById(id)
//                .map(c ->
//                {
//                    c.setId(id);
//                    persistenciaCliente.save(c);
//                    endereco.atualizar(c.getEndereco());
//                    return c;
//                });
        buscarPorId(id);
        cliente.setId(id);
        buscarCepEAtribuirEnderecoAoCliente(cliente);
        return persistenciaCliente.save(cliente);
    }


    @Override
    public void deletar(Long id)
    {
        persistenciaCliente.delete(buscarPorId(id));
    }

//    @Transactional
    private void buscarCepEAtribuirEnderecoAoCliente(Cliente cliente)
    {
        String cepRecebido;
        Endereco enderecoLocalizado;

        cepRecebido = cliente.getEndereco().getCep();
        enderecoLocalizado = buscaEndereco.consultarCep(cepRecebido);
        cliente.setEndereco(enderecoLocalizado);
    }
}
