package designpattern.strategy.example.order;

import org.junit.Assert;
import org.junit.Test;

import designpattern.strategy.example.order.dto.OrderType;
import designpattern.strategy.example.order.process.IOrderStategyFactory;
import designpattern.strategy.example.order.process.OrderStategyFactoryImpl;
import designpattern.strategy.example.order.process.sendmail.IMailSenderStrategy;
import designpattern.strategy.example.order.process.sendmail.MailSenderStrategy;
import designpattern.strategy.example.order.process.strategies.AbstractOrderStrategy;
import designpattern.strategy.example.order.process.strategies.RetailOrderStrategy;
import designpattern.strategy.example.order.process.strategies.SpecialOrderStrategy;
import designpattern.strategy.example.order.process.strategies.WholeSaleOrderStrategy;

public class WriteOrderTest {
	@Test
	public void testWriteOrderStrategies()
	{
		IOrderStategyFactory stategyFactory = new OrderStategyFactoryImpl();
		
		AbstractOrderStrategy orderStrategy1 = stategyFactory.createOrderStrategy(OrderType.WHOLESALE_ORDER);
		//IMailSenderStrategy mailSenderStrategy1 = new MailSenderStrategy();
		//orderStrategy1.setMailSenderStrategy(mailSenderStrategy1);
		
		Assert.assertTrue(orderStrategy1 instanceof WholeSaleOrderStrategy);
		
		AbstractOrderStrategy orderStrategy2 = stategyFactory.createOrderStrategy(OrderType.RETAIL_ORDER);
		Assert.assertTrue(orderStrategy2 instanceof RetailOrderStrategy);
		
		AbstractOrderStrategy orderStrategy3 = stategyFactory.createOrderStrategy(OrderType.SPECIAL_ORDER);
		Assert.assertTrue(orderStrategy3 instanceof SpecialOrderStrategy);
	}
}
