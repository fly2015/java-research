package designpattern.strategy.example.order.process.strategies;

import designpattern.strategy.example.order.dto.OrderResult;
import designpattern.strategy.example.order.dto.Ordering;

public abstract class AbstractOrderStrategy {
	protected abstract OrderResult processOrder(Ordering ordering);
	protected void writeOrder(Ordering ordering) 
	{
		System.out.println("Writting any type of order...");
	}
}
