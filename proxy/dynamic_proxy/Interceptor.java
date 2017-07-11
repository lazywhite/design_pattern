/*
 * Interceptor.java
 * Copyright (C) 2017 white <white@localhost>
 *
 * Distributed under terms of the MIT license.
 */

public class Interceptor {
     
	public void doBefore() {
        System.out.println("before invoking");
	}
	public void doAfter() {
        System.out.println("after invoking");
	}
}

