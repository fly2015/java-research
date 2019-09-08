package designpattern.strategy.example.order.process.otp;

public abstract class AbstractOTPHandler implements IOTPHandler {

	public abstract void requestOTP();

	public boolean verifyOTP(String code) {
		System.out.println("Verifying the OTP code...");
		return false;
	}

}
