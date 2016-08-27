package in.co.DTO;

public class CCPaymentDTO extends PaymentDTO {
	private long id1;
	private String ccType;

	public long getId1() {
		return id1;
	}

	public void setId1(long id1) {
		this.id1 = id1;
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

}
