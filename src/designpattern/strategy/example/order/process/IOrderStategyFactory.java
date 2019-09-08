package designpattern.strategy.example.order.process;

import designpattern.strategy.example.order.dto.OrderType;
import designpattern.strategy.example.order.process.strategies.AbstractOrderStrategy;

public interface IOrderStategyFactory {
	AbstractOrderStrategy createOrderStrategy(OrderType orderType);
}
