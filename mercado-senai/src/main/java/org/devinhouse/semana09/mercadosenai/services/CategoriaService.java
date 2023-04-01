package org.devinhouse.semana09.mercadosenai.services;

import org.devinhouse.semana09.mercadosenai.models.Categoria;
import org.devinhouse.semana09.mercadosenai.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public void salvar(Categoria categoria){
        this.repository.save(categoria);
    }

    public void excluir(Categoria categoria){
        this.repository.delete(categoria);
    }
}
