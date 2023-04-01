package org.devinhouse.semana09.mercadosenai.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import org.devinhouse.semana09.mercadosenai.models.Produto;

public class ClienteDTO {
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
