package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Estado> listar(){
        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Transactional
    public Estado salvar(Estado estado){
        return manager.merge(estado);
    }

    public Estado buscar(Long id){
        return manager.find(Estado.class, id);
    }

    @Transactional
    public void remover(Estado estado){
        estado = buscar(estado.getId());
        manager.remove(estado);
    }
}
