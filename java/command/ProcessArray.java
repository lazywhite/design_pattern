/*
 * ProcessArray.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */

public class ProcessArray {
     
    public void each(int[] target, Command cmd){
        cmd.process(target);
    }
}

