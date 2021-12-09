package com.eric.orderservice.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Order {
  private long orderId;
  private String orderDate;
  private long totalAmount;
}
