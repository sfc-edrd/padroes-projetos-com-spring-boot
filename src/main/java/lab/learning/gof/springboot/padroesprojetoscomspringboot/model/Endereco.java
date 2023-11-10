package lab.learning.gof.springboot.padroesprojetoscomspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Endereco
{
    
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (!Objects.equals(cep, endereco.cep)) return false;
        if (!Objects.equals(logradouro, endereco.logradouro)) return false;
        if (!Objects.equals(complemento, endereco.complemento))
            return false;
        if (!Objects.equals(bairro, endereco.bairro)) return false;
        if (!Objects.equals(localidade, endereco.localidade)) return false;
        if (!Objects.equals(uf, endereco.uf)) return false;
        if (!Objects.equals(ibge, endereco.ibge)) return false;
        if (!Objects.equals(gia, endereco.gia)) return false;
        if (!Objects.equals(ddd, endereco.ddd)) return false;
        return Objects.equals(siafi, endereco.siafi);
    }

    @Override
    public int hashCode() {
        int result = cep != null ? cep.hashCode() : 0;
        result = 31 * result + (logradouro != null ? logradouro.hashCode() : 0);
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (localidade != null ? localidade.hashCode() : 0);
        result = 31 * result + (uf != null ? uf.hashCode() : 0);
        result = 31 * result + (ibge != null ? ibge.hashCode() : 0);
        result = 31 * result + (gia != null ? gia.hashCode() : 0);
        result = 31 * result + (ddd != null ? ddd.hashCode() : 0);
        result = 31 * result + (siafi != null ? siafi.hashCode() : 0);
        return result;
    }

    public class Builder
    {
        static private Endereco enderecoBuilt;

        static
        {
            enderecoBuilt = new Endereco();
        }

        public static Endereco comCEP(String cep)
        {
            enderecoBuilt.setCep(cep);
            return enderecoBuilt;
        }
    }
}
