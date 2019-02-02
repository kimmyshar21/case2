package com.cg.on;

public class CabBooking {
	private int otp;
	private String pickUp;
	private String drop;
	private String mobileNo;
	private String cabType;

	
	public CabBooking() { }
	
	public CabBooking(int otp,String pickUp,String drop,String mobileNo,String cabType) {
		this.otp = otp;
		this.pickUp = pickUp;
		this.drop = drop;
		this.mobileNo = mobileNo;
		this.cabType = cabType;
	}
	public int getotp() {
		return otp;
	}
	public void setotp(int otp) {
		this.otp = otp;
	}
	public String getpickUp() {
		return pickUp;
	}
	public void setpickUp(String pickUp) {
		this.pickUp = pickUp;
	}
	public String getdrop() {
		return drop;
	}
	public void setdrop(String drop) {
		this.drop = drop;
	}
	public String getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		this.mobileNo= mobileNo;
	}
	public String getcabType() {
		return cabType;
	}
	public void setcabType(String cabType) {
		this.cabType= cabType;
	}
	
	
	@Override
	public String toString() {
		return "Cab [otp=" + otp + ", pickUp="
				+ pickUp + ", drop=" + drop + ",mobileNo=" + mobileNo + ",cabType=" + cabType + "]";
	}
}




