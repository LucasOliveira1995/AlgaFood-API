package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Permissao> listar(){
        return manager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    @Transactional
    public Permissao salvar(Permissao permissao){
        return manager.merge(permissao);
    }

    public Permissao buscar(Long id){
        return manager.find(Permissao.class, id);
    }

    @Transactional
    public void remover(Permissao permissao){
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }
}
