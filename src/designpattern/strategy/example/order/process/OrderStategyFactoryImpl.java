package designpattern.strategy.example.order.process;

import java.util.HashMap;
import java.util.Map;

import designpattern.strategy.example.order.dto.OrderType;
import designpattern.strategy.example.order.process.sendmail.MailSenderStrategy;
import designpattern.strategy.example.order.process.strategies.AbstractOrderStrategy;
import designpattern.strategy.example.order.process.strategies.RetailOrderStrategy;
import designpattern.strategy.example.order.process.strategies.SpecialOrderStrategy;
import designpattern.strategy.example.order.process.strategies.WholeSaleOrderStrategy;

public class OrderStategyFactoryImpl implements IOrderStategyFactory{
	private static Map<OrderType, AbstractOrderStrategy> orderStrategies = new HashMap<OrderType, AbstractOrderStrategy>();
	static
	{
		orderStrategies.put(OrderType.WHOLESALE_ORDER, new WholeSaleOrderStrategy(new MailSenderStrategy()));
		orderStrategies.put(OrderType.RETAIL_ORDER, new RetailOrderStrategy());
		orderStrategies.put(OrderType.SPECIAL_ORDER, new SpecialOrderStrategy(new MailSenderStrategy()));
	}
	public AbstractOrderStrategy createOrderStrategy(OrderType orderType) {
		// TODO Auto-generated method stub
		return orderStrategies.get(orderType);
	}
	
}
