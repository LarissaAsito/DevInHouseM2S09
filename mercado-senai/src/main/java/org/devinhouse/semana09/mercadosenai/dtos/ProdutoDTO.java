package org.devinhouse.semana09.mercadosenai.dtos;

import jakarta.persistence.ManyToOne;
import org.devinhouse.semana09.mercadosenai.models.Categoria;

public class ProdutoDTO {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
