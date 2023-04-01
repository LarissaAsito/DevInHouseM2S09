package org.devinhouse.semana09.mercadosenai.services;

import org.devinhouse.semana09.mercadosenai.models.Produto;
import org.devinhouse.semana09.mercadosenai.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public void salvar(Produto produto){
        this.repository.save(produto);

    }

    public void excluir(Produto produto){
        this.repository.delete(produto);
    }
}
