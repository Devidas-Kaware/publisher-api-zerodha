package com.publisher.api.dto;

public class BasketDto {
	private String tradingSymbol;
	private String exchange;
	private String transactionType;
	private int quantity;

	public BasketDto() {
	}

	public BasketDto(String tradingSymbol, String exchange, String transactionType, int quantity) {
		super();
		this.tradingSymbol = tradingSymbol;
		this.exchange = exchange;
		this.transactionType = transactionType;
		this.quantity = quantity;
	}

	public String getTradingSymbol() {
		return tradingSymbol;
	}

	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
