package br.com.escritorio.contabilidade.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Cliente {
    public UUID id;

    public boolean clienteAtivo;

    public Date cadastradoEm;

    public static Contato contato;

    public Endereco endereco;


    public Cliente(UUID id, boolean clienteAtivo, LocalDate caadastradoEm, Contato contato, Endereco endereco) {
        this.id = id;
        this.clienteAtivo = clienteAtivo;
        this.cadastradoEm = cadastradoEm;
        this.contato = contato;
        this.endereco = endereco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isClienteAtivo() {
        return clienteAtivo;
    }

    public void setClienteAtivo(boolean clienteAtivo) {
        this.clienteAtivo = clienteAtivo;
    }

    public Date getCaadastradoEm() {
        return cadastradoEm;
    }

    public void setCaadastradoEm(Date caadastradoEm) {
        this.cadastradoEm = caadastradoEm;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", clienteAtivo=" + clienteAtivo +
                ", caadastradoEm=" + cadastradoEm +
                ", contato=" + contato +
                ", endereco=" + endereco +
                '}';
    }
}