package in.co.DTO;

public class ChequeDTO extends PaymentDTO {
	private long id3;
	private long chqNumber;
	private String bankName;

	public long getId3() {
		return id3;
	}

	public void setId3(long id3) {
		this.id3 = id3;
	}

	public long getChqNumber() {
		return chqNumber;
	}

	public void setChqNumber(long chqNumber) {
		this.chqNumber = chqNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
