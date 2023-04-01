package org.devinhouse.semana09.mercadosenai.repositories;

import org.devinhouse.semana09.mercadosenai.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
