package com.csc.oep.dao;

import com.csc.oep.entity.HelloWorldEntity;

public class HelloWorldEventDao extends GenericDaoImpl<HelloWorldEntity,Long> {
    public HelloWorldEventDao() {
        super(HelloWorldEntity.class);
    }

}
