package com.csc.oep.service;

import com.csc.oep.dao.Dao;
import com.csc.oep.dao.HelloWorldEventDao;
import com.csc.oep.entity.HelloWorldEntity;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class HelloWorldServiceImpl implements HelloWorldService {
    
    
    private HelloWorldEventDao helloWorldEventDao;
    
    public HelloWorldServiceImpl() {
        super();
    }


    public void setHelloWorldEventDao(HelloWorldEventDao helloWorldEventDao) {
        this.helloWorldEventDao = helloWorldEventDao;
    }

    public HelloWorldEntity saveEvent(HelloWorldEntity event) {
       return helloWorldEventDao.save(event) ;
    }

    @Override
    public HelloWorldEntity getEvent(Long id) {
       return helloWorldEventDao.findOne(id) ;
    }
}
