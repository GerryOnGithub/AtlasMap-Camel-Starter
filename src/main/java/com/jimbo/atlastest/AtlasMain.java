package com.jimbo.atlastest;

import org.apache.camel.builder.RouteBuilder;

public class AtlasMain extends RouteBuilder {
    public void configure() {
	        from("timer:goo?period=500000")
	            .log("Start time " + java.lang.System.currentTimeMillis())
	            .log("Start cpu " + CpuTime.getCpuTime())
	            .setBody(simple("resource:classpath:input.json"))
	            .to("atlasmap:uber-simple.adm")
	        //  .log("Received:\n[${body}] ")
	            .log("End cpu " + CpuTime.getCpuTime())
	            .log("End time " + java.lang.System.currentTimeMillis());
    }
}
