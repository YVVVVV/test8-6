package main.com.util;

public class ServiceFactory {

    public static Object getservice(Object service){
        return new TransactionInvocationHandler(service).getProxy();

    }

}
