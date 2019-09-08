package designpattern.strategy.example.order.dto;

public enum OrderType {
	WHOLESALE_ORDER(1),
	RETAIL_ORDER(2),
	SPECIAL_ORDER(3);
	
	final int id;
	OrderType(int id)
	{
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public OrderType getOrderTypeById(int id)
	{
		return OrderType.values()[id];
	}
}
