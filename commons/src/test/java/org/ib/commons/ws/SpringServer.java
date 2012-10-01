package org.ib.commons.ws;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/1/12
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class SpringServer {
    protected SpringServer() {
    }

    public static void main(String args[]) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("server-applicationContext.xml");
        System.in.read();
        ctx.stop();
        ctx.destroy();
    }
}
