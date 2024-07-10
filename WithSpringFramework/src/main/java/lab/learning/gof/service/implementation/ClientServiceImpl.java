package lab.learning.gof.service.implementation;

import lab.learning.gof.model.Cliente;
import lab.learning.gof.model.Endereco;
import lab.learning.gof.repository.ClienteRepository;
import lab.learning.gof.repository.EnderecoRepository;
import lab.learning.gof.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientServiceImpl implements IClienteService
{
    @Autowired
    private final ClienteRepository clienteRepository;
    @Autowired
    private final EnderecoRepository enderecoRepository;
    @Autowired
    private final ViaCepService viaCepService;

    public ClientServiceImpl(
            ClienteRepository clienteRepository,
            EnderecoRepository enderecoRepository,
            ViaCepService viaCepService)
    {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    @Override
    public Iterable<Cliente> buscarTodos()
    {
        return (List) clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id)
    {
        return clienteRepository.findById(id).orElseThrow();
    }

    @Override
    public void inserir(Cliente cliente)
    {
        String cepClient = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cepClient).orElseGet(() ->
                {
                    Endereco enderecoObtidoPeloCep = viaCepService.obterEnderecoPeloCep(cepClient);
                    enderecoRepository.save(enderecoObtidoPeloCep);
                    return enderecoObtidoPeloCep;
                }
        );
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente)
    {
        Cliente clienteLocalizado = clienteRepository.findById(id).orElseThrow();
        inserir(cliente);
        return cliente;
    }

    @Override
    public void deletar(Long id)
    {
        clienteRepository.delete(buscarPorId(id));
    }
}
