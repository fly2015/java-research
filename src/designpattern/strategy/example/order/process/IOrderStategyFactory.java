package designpattern.strategy.example.order.process;

import designpattern.strategy.example.order.dto.OrderType;

public interface IOrderStategyFactory {
	AbstractOrderStrategy createOrderStrategy(OrderType orderType);
}
