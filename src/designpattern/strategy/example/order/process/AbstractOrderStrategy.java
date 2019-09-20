package designpattern.strategy.example.order.process;

import designpattern.strategy.example.order.dto.OrderResult;
import designpattern.strategy.example.order.dto.Ordering;
import designpattern.strategy.example.order.process.otp.IOTPSender;
import designpattern.strategy.example.order.process.sendmail.IMailSenderStrategy;

public abstract class AbstractOrderStrategy {
	private IMailSenderStrategy mailSenderStrategy;
	private IOTPSender iotpSender;
	
	protected void setMailSenderStrategy(IMailSenderStrategy mailSenderStrategy) {
		this.mailSenderStrategy = mailSenderStrategy;
	}

	protected void setIotpSender(IOTPSender iotpSender) {
		this.iotpSender = iotpSender;
	}


	public abstract OrderResult processOrder(Ordering ordering) throws Exception;
	protected void writeOrder(Ordering ordering) 
	{
		System.out.println("Writting order for order type " + ordering.getOrderType().name());
	}
	
	protected void sendMail(Ordering ordering) throws Exception 
	{
		if(mailSenderStrategy == null)
		{
			throw new Exception("Please check the order type " + ordering.getOrderType().name() + " is allowed send an email or not");
		}
		mailSenderStrategy.sendMail();
		System.out.println("Sending the email for order type " + ordering.getOrderType().name());
	}
	
	protected void sendOTP(Ordering ordering) throws Exception 
	{
		if(iotpSender == null)
		{
			throw new Exception("Please check the order type " + ordering.getOrderType().name() + " is allowed send an OTP or not");
		}
		iotpSender.sendOTP();
		System.out.println("Sending the OTP for order type " + ordering.getOrderType().name());
	}
}
