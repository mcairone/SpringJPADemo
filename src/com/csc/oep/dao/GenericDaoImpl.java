package com.csc.oep.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDaoImpl<E,K>  implements Dao<E,K>{
    
    @PersistenceContext   
    private EntityManager entityManager;
    
    protected Class<E> type;
    
    public GenericDaoImpl() {
        super();
    }
    
    public GenericDaoImpl( Class<E> type) {
        this.type = type;
    }

    @Override
    public E findOne(K id) {
      return  entityManager.find(type, id);
    }

    @Override
    public List<E> findAll() {
       return  entityManager.createQuery( "from " + type.getName() )
                       .getResultList();
    }

    @Override
    public E save(E entity) {
        entityManager.persist( entity );
        return entity;
    }

    @Override
    public E update(E entity) {
        return entityManager.merge( entity );
    }

    @Override
    public void delete(E entity) {
        entityManager.remove( entity );   
    }

    @Override
    public void deleteById(K Id) {
        E entity = findOne( Id );
        delete( entity );
    }
}
