package lab.learning.gof.springboot.padroesprojetoscomspringboot.service.implementation;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Cliente;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Endereco;
import lab.learning.gof.springboot.padroesprojetoscomspringboot.service.IServicoCliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DirtiesContext
class ServicoClienteImplTest
{
    @Autowired
    private IServicoCliente servicoCliente;

    Endereco enderecoInicial = Endereco.Builder.comCEP("20750340");
    Cliente clienteInicial = new Cliente("Anderson Silva", enderecoInicial);

    @Test
    @Order(1)
    @DisplayName("Testa se o cliente retornado é da classe esperada")
    void inserir()
    {
        Assertions
                .assertTrue(
                        servicoCliente
                                .inserir(clienteInicial)
                                .getClass().getName().contains("Cliente"));
    }

    @Test
    @Order(2)
    void buscarTodos()
    {
        List<Cliente> listaRetornada = (List)servicoCliente.buscarTodos();
        Assertions.assertAll(
                () -> Assertions.assertTrue(listaRetornada.size() == 1),
                () -> Assertions.assertAll(() -> listaRetornada.stream().map(c -> c.getClass().getName().contains("Cliente")))
        );
    }

    @Test
    void buscarPorId() {
    }

    @Test
    void atualizar() {
    }

    @Test
    void deletar() {
    }
}