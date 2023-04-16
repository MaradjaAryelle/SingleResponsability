package br.com.escritorio.contabilidade.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class PessoaFisica extends Cliente {
    public String nome;

    public Date dataNascimento;

    public String sexo;

    public String apelido;

    protected String _RG;

    protected String _CPF;

    public PessoaFisica(UUID id, boolean clienteAtivo, LocalDate cadastradoEm, Contato contato, Endereco endereco, String nome, Date dataNascimento, String sexo, String apelido, String _RG, String _CPF) {
        super(id, clienteAtivo, cadastradoEm, contato, endereco);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.apelido = apelido;
        this._RG = _RG;
        this._CPF = _CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String get_RG() {
        return _RG;
    }

    public void set_RG(String _RG) {
        this._RG = _RG;
    }

    public String get_CPF() {
        return _CPF;
    }

    public void set_CPF(String _CPF) {
        this._CPF = _CPF;
    }
}
