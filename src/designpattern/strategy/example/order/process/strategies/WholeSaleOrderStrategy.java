package designpattern.strategy.example.order.process.strategies;

import designpattern.strategy.example.order.dto.OrderResult;
import designpattern.strategy.example.order.dto.Ordering;
import designpattern.strategy.example.order.process.AbstractOrderStrategy;

public class WholeSaleOrderStrategy extends AbstractOrderStrategy
{
	@Override
	public OrderResult processOrder(Ordering ordering) throws Exception {
		writeOrder(ordering);
		sendMail(ordering);
		
		return new OrderResult();
	}
}
