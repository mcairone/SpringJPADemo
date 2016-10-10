package com.csc.oep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HELLO_WORLD")
public class HelloWorldEntity {
    @Id
    @SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_HELLO_WORLD", allocationSize=1 ,initialValue=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN") 
    private long id;
    
    private String message;

    public HelloWorldEntity() {
        super();
     }

    public HelloWorldEntity(long id, String message) {
        super();
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage (String message) {
        this.message = message;
    }


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    
    
    
    @Override
    public String toString(){
      return "HelloWorldEvent [ id = "+ id + " message = "+message+ "] ";
    }
}
