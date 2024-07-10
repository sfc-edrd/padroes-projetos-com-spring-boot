package lab.learning.gof.service.implementation;

import lab.learning.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCepService
{
    @GetMapping("{cep}/json")
    Endereco obterEnderecoPeloCep(@PathVariable ("cep") String cep);
}
