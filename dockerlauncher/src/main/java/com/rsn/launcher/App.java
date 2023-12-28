package com.rsn.launcher;

import com.rsn.ag.ApiGatewayApplication;
import com.rsn.ccs.CloudConfigServerApplication;
import com.rsn.cs.CustomerServiceApplication;
import com.rsn.hystrix.HystrixApplication;
import com.rsn.is.InventoryServiceApplication;
import com.rsn.os.OrderServiceApplication;
import com.rsn.ps.PaymentServiceApplication;
import com.rsn.ps.ProductServiceApplication;
import com.rsn.sr.ServiceRegisteryApplication;


public class App {
	public static void main(String[] args) {
		startMicroservice(ApiGatewayApplication.class, args);
		startMicroservice(CloudConfigServerApplication.class, args);
		startMicroservice(CustomerServiceApplication.class, args);
		startMicroservice(HystrixApplication.class, args);
		startMicroservice(InventoryServiceApplication.class, args);
		startMicroservice(OrderServiceApplication.class, args);
		startMicroservice(PaymentServiceApplication.class, args);
		startMicroservice(ProductServiceApplication.class, args);
		startMicroservice(ServiceRegisteryApplication.class, args);
		System.out.println("micorservice laucher is started**");
	}

	private static void startMicroservice(Class<?> applicationClass, String[] args) {
		try {
			applicationClass.getMethod("main", String[].class).invoke(null, (Object) args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
