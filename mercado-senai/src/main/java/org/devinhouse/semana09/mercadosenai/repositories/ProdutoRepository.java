package org.devinhouse.semana09.mercadosenai.repositories;

import org.devinhouse.semana09.mercadosenai.models.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>  {
}
