/*
 * Bird.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */

public class Bird implements CanFly, CanTweet{
     
    @Override
    public void tweet(){
        System.out.println("zzzzzzzz");
    }
    
    @Override
    public void fly(){
        System.out.println("flying");
    }
}

