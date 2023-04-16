package br.com.escritorio.contabilidade.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class PessoaJuridica extends Cliente {
    public String CNPJ;

    public String razaoSocial;

    public String nomeFantasia;

    public PessoaJuridica(UUID id, boolean clienteAtivo, LocalDate cadastradoEm, Contato contato, Endereco endereco, String nome, Date dataNascimento, String sexo, String apelido, String _RG, String _CPF) {
        super(id, clienteAtivo, cadastradoEm, contato, endereco);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
