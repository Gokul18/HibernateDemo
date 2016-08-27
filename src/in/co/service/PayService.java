package in.co.service;

import in.co.DTO.PaymentDTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PayService {
	public void add(PaymentDTO dto) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(dto);
		tr.commit();
		session.close();
		System.out.println("Balance successfully added");
	}
}
