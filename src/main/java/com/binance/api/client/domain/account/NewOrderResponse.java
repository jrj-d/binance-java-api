package com.binance.api.client.domain.account;

import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.binance.api.client.domain.general.SymbolInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * Response returned when placing a new order on the system.
 *
 * @see NewOrder for the request
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOrderResponse {

  /**
   * Order symbol.
   */
  private String symbol;

  /**
   * Order id.
   */
  private Long orderId;

  /**
   * This will be either a generated one, or the newClientOrderId parameter
   * which was passed when creating the new order.
   */
  private String clientOrderId;

  /**
   * Transact time for this order.
   */
  private Long transactTime;

  /**
   * Price.
   */
  private String price;

  /**
   * Original quantity.
   */
  private String origQty;

  /**
   * Original quantity.
   */
  private String executedQty;

  /**
   * Order status.
   */
  private OrderStatus status;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  private TimeInForce timeInForce;

  /**
   * Type of order.
   */
  private OrderType type;

  /**
   * Buy/Sell order side.
   */
  private OrderSide side;

  /**
   * Used with stop orders.
   */
  private String stopPrice;

  /**
   * Used with iceberg orders.
   */
  private String icebergQty;

  /**
   * All the transactions that filled the order.
   */
  private List<OrderFill> fills;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  public Long getTransactTime() {
    return transactTime;
  }

  public void setTransactTime(Long transactTime) {
    this.transactTime = transactTime;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getOrigQty() {
    return origQty;
  }

  public void setOrigQty(String origQty) {
    this.origQty = origQty;
  }

  public String getExecutedQty() {
    return executedQty;
  }

  public void setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public OrderSide getSide() {
    return side;
  }

  public void setSide(OrderSide side) {
    this.side = side;
  }

  public String getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(String stopPrice) {
    this.stopPrice = stopPrice;
  }

  public String getIcebergQty() {
    return icebergQty;
  }

  public void setIcebergQty(String icebergQty) {
    this.icebergQty = icebergQty;
  }

  public List<OrderFill> getFills() {
    return fills;
  }

  public void setFills(List<OrderFill> fills) {
    this.fills = fills;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("symbol", symbol)
        .append("orderId", orderId)
        .append("clientOrderId", clientOrderId)
        .append("transactTime", transactTime)
        .append("price", price)
        .append("origQty", origQty)
        .append("executedQty", executedQty)
        .append("status", status)
        .append("timeInForce", timeInForce)
        .append("type", type)
        .append("side", side)
        .append("stopPrice", stopPrice)
        .append("icebergQty", icebergQty)
        .toString();
  }
}
