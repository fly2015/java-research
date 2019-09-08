package designpattern.strategy.example.order.process.strategies;

import designpattern.strategy.example.order.dto.OrderResult;
import designpattern.strategy.example.order.dto.Ordering;
import designpattern.strategy.example.order.process.sendmail.IMailSenderStrategy;

public class WholeSaleOrderStrategy extends AbstractOrderStrategy implements IMailSenderStrategy{
	private IMailSenderStrategy mailSenderStrategy;
	public WholeSaleOrderStrategy(IMailSenderStrategy mailSenderStrategy)
	{
		this.mailSenderStrategy = mailSenderStrategy;
	}
	@Override
	protected OrderResult processOrder(Ordering ordering) {
		writeOrder(ordering);
		sendMail();
		
		return new OrderResult();
	}
	
	public void sendMail() {
		mailSenderStrategy.sendMail();
	}

}
