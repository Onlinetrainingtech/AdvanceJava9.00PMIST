package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import str.Customers;

public class ForOurLogic {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Customers e1=new Customers();
		e1.setCustomerid(2001);
		e1.setCustomerName("mohamed");
		
		session.save(e1);
		
		t.commit();
		System.out.println("Inserted...");


	}

}
