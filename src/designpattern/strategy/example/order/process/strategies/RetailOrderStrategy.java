package designpattern.strategy.example.order.process.strategies;

import designpattern.strategy.example.order.dto.OrderResult;
import designpattern.strategy.example.order.dto.Ordering;

public class RetailOrderStrategy extends AbstractOrderStrategy{

	@Override
	protected OrderResult processOrder(Ordering ordering) {
		writeOrder(ordering);
		// TODO Auto-generated method stub
		return null;
	}

}
