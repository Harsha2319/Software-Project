package cs6359.utdcart.entity.impl;

import java.time.LocalDate;
import java.util.Date;

public class PaymentMethod {

	// private long pmID;
	private long cardNo;
	private int cvv;
	private LocalDate expDate;

	public PaymentMethod(long cardNo, int cvv, LocalDate expDate) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expDate = expDate;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

}
