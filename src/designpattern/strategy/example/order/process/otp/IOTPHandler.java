package designpattern.strategy.example.order.process.otp;

public interface IOTPHandler 
{
	public boolean verifyOTP(String code);
}
