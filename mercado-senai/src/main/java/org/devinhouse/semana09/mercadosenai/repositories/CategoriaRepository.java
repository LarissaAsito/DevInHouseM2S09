package org.devinhouse.semana09.mercadosenai.repositories;

import org.devinhouse.semana09.mercadosenai.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
