package donghwan.sp5;

import donghwan.sp5.chap02.AppContext;
import donghwan.sp5.chap02.Greeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sp5Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("Donghwan");
		System.out.println(msg);
		System.out.println("(g == g1) = " + (g == g1));
		ctx.close();
		SpringApplication.run(Sp5Application.class, args);
	}

}
