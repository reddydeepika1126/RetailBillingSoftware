package in.billing.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.billing.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
