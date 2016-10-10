package com.csc.oep.service;

import com.csc.oep.entity.HelloWorldEntity;

public interface HelloWorldService {
    
    public HelloWorldEntity saveEvent(HelloWorldEntity event);

    public HelloWorldEntity getEvent(Long id);
    
    
}
