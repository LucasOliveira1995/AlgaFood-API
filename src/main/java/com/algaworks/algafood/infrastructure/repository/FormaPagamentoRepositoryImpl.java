package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<FormaPagamento> listar(){
        return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
    }

    @Transactional
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return manager.merge(formaPagamento);
    }

    public FormaPagamento buscar(Long id){
        return manager.find(FormaPagamento.class, id);
    }

    @Transactional
    public void remover(FormaPagamento formaPagamento){
        formaPagamento = buscar(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
