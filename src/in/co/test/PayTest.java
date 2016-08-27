package in.co.test;

import in.co.DTO.CCPaymentDTO;
import in.co.DTO.CashDTO;
import in.co.DTO.ChequeDTO;
import in.co.service.PayService;

public class PayTest {
	public static void main(String[] args) {
		/*CashDTO dto = new CashDTO();
		dto.setPaymentType("Cash");
		dto.setAmount(1000);*/

		CCPaymentDTO dto2 = new CCPaymentDTO();
		dto2.setPaymentType("CreditCard");
		dto2.setAmount(1000);
		dto2.setCcType("Gold");

		/*ChequeDTO dto3 = new ChequeDTO();
		dto3.setAmount(2000);
		dto3.setChqNumber(12345);
		dto3.setBankName("SBI");
		dto3.setPaymentType("Check");*/

		PayService service = new PayService();
		service.add(dto2);
	}

}
