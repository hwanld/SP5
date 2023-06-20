package donghwan.sp5;

import donghwan.sp5.chap06.AppContext;
import donghwan.sp5.chap06.Client;
import donghwan.sp5.chap06.Client2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Sp5Application {
	private static ApplicationContext ctx = null;

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(AppContext.class);

		Client client = abstractApplicationContext.getBean(Client.class);
		client.send();

		Client2 client2 = abstractApplicationContext.getBean(Client2.class);
		client2.send();
		abstractApplicationContext.close();
	}
}
