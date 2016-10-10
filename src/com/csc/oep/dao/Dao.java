package com.csc.oep.dao;


import java.util.List;

public interface Dao<E ,K> {
   
   public E findOne( K id );
   public List< E > findAll();
   public E save( E entity );
   public E update( E entity );
   public void delete( E entity );
   public void deleteById( K Id );
   
}