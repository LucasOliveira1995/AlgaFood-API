package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Cidade> listar(){
        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Transactional
    public Cidade salvar(Cidade cidade){
        return manager.merge(cidade);
    }

    public Cidade buscar(Long id){
        return manager.find(Cidade.class, id);
    }

    @Transactional
    public void remover(Cidade cidade){
        cidade = buscar(cidade.getId());
        manager.remove(cidade);
    }
}
