package com.eric.orderservice.facades;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(OrderFacade.class)
public class StreamConfig {

}
