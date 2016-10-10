package com.csc.oep.bean;
import com.bea.wlevs.ede.api.EventRejectedException;

import com.bea.wlevs.ede.api.StreamSink;

import com.csc.oep.entity.HelloWorldEntity;
import com.csc.oep.event.HelloWorldEvent;
import com.csc.oep.service.HelloWorldService;

public class HelloWorldBrean implements StreamSink {
    
    private HelloWorldService helloWorldService;
   
    @Override
    public void onInsertEvent(Object object) throws EventRejectedException {
        
        if(object instanceof HelloWorldEvent ) {
               
            HelloWorldEvent event = (HelloWorldEvent) object;
            
            //Create the entity object to save
            HelloWorldEntity tmp  = new HelloWorldEntity(event.getId(), event.getMessage());
           
           //Save the entity to DB
            tmp = helloWorldService.saveEvent(tmp);
           
           //Retrive the entity from DB
            HelloWorldEntity entity =  helloWorldService.getEvent(tmp.getId());
            
            //Print the entity
            System.out.println(entity);       
        }
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }  
    
}
