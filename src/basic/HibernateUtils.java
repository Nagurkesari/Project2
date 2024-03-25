package basic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sf = null;

	public static SessionFactory buildSessionFactoryObject() {

		if (sf == null) {
			try {
			// S-1 : configuration to build session factory
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Admin.class);
			
			System.out.println("Config loaded !!");

			// S-2 : session factory to obtain session
			sf = cfg.buildSessionFactory();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Something wrong with Session factory Object");
			}
		}
		return sf;
	}
	
	private HibernateUtils() {}

}