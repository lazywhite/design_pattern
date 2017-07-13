/*
 * Copyright (C) 2017 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

/* 1. 构造注入 
 *
 *  好处: 可以保证注入的值合法(不为null)
 *  缺点: 依赖改变时代码不灵活 
 * */
//public class Client {

//    public Client(Service service) {
         Save the reference to the passed-in service inside this client
//        this.service = service;
//    }
//}
//
//
//
/* 2. Setter 注入 
 * 好处: 灵活度高
 * 缺点: 无法保证所有的依赖同时可用
 *
 * */

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


