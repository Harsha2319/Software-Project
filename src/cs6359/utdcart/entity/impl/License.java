package cs6359.utdcart.entity.impl;

import java.time.LocalDate;
import java.util.Date;

public class License {
	private long licenseNo;
	private LocalDate issuedDate;
	private LocalDate expDate;
	
	public License(long licenseNo, LocalDate issuedDate, LocalDate expDate) {
		super();
		this.licenseNo = licenseNo;
		this.issuedDate = issuedDate;
		this.expDate = expDate;
	}

	public long getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(long licenseNo) {
		this.licenseNo = licenseNo;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		expDate = expDate;
	}
	
	
}


