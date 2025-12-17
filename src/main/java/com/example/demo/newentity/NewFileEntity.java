package com.example.demo.newentity


public class NewFileEntity{
    @id
    @GeneratedValue(stratgey=GeneratorType);
    private long id;
    private String name;
     @notblank(message="No blank allowed");
     @email(message="invalid format");
     private String email;
     
     

}