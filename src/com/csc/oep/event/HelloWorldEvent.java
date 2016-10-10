package com.csc.oep.event;



public class HelloWorldEvent {

    private long id;
    
    private String message;

    public HelloWorldEvent() {
        super();
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
