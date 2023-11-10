package lab.learning.gof.springboot.padroesprojetoscomspringboot.service;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCep", url = "https://viacep.com.br/ws")
public interface IServicoViaCep
{
    @GetMapping(value = "/{cep}/json/")
    Endereco consultarCep (@PathVariable("cep") String cep);
}
