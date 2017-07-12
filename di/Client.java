/*
 * Copyright (C) 2017 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

/* 1. 构造注入 */
//public class Client {

//    public Client(Service service) {
         Save the reference to the passed-in service inside this client
//        this.service = service;
//    }
//}
//
//
//
/* 2. Setter 注入 */
//public void setService(Service service) {
     Save the reference to the passed-in service inside this client
//    this.service = service;
//}
//
/* 3. 接口注入 */
// Service setter interface.
public interface ServiceSetter {
    public void setService(Service service);
}

// Client class
public class Client implements ServiceSetter {
    // Internal reference to the service used by this client.
    private Service service;

    // Set the service that this client is to use.
    @Override
    public void setService(Service service) {
        this.service = service;
    }
}


