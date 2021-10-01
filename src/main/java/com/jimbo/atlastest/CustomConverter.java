package com.jimbo.atlastest;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;

@Converter
public final class CustomConverter {

	private CustomConverter() { }

@Converter
public static PurchaseOrder toPurchaseOrder(String data, Exchange exchange) {

if (exchange != null) {
	System.out.println("it isnt null which is good");
}

else {
System.out.println("it is null which is not good");
}

return new PurchaseOrder("23");

}

}


