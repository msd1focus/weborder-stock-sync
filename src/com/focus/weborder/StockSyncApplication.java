package com.focus.weborder;

import com.focus.weborder.api.RESTInvoker;

public class StockSyncApplication {

	public StockSyncApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("StockSyncApplication");
		RESTInvoker ri = new RESTInvoker(
				"http://focusdev.focus.co.id:9080",
				"FDIadmin",
				"password");
		String restResponse = ri.getRESTResponse("/weborder/rest/custprodstock/sync");
		System.out.println("restResponse: " + restResponse);
	}

}
