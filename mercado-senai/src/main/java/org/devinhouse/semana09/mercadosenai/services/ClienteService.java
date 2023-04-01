package org.devinhouse.semana09.mercadosenai.services;

import org.devinhouse.semana09.mercadosenai.models.Cliente;
import org.devinhouse.semana09.mercadosenai.models.Produto;
import org.devinhouse.semana09.mercadosenai.repositories.ClienteRepository;
import org.devinhouse.semana09.mercadosenai.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository repository;

    public void salvar(Cliente cliente){
        this.repository.save(cliente);

    }

    public void excluir(Cliente cliente){
        this.repository.delete(cliente);
    }
}
