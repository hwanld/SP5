package donghwan.sp5;

import donghwan.sp5.chap03.AppCtx1;
import donghwan.sp5.chap03.ChangePasswordService;
import donghwan.sp5.chap03.MemberRegisterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sp5Application {
	private static ApplicationContext ctx = null;

	public static void main(String[] args) {

	}

//	Chap03
//	public static void main(String[] args) {
//		ctx = new AnnotationConfigApplicationContext(AppCtx1.class);
//		MemberRegisterService memberRegisterService = ctx.getBean(MemberRegisterService.class);
//		ChangePasswordService changePasswordService = ctx.getBean(ChangePasswordService.class);
//		SpringApplication.run(Sp5Application.class, args);
//	}

//  Chap02
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		Greeter g = ctx.getBean("greeter", Greeter.class);
//		Greeter g1 = ctx.getBean("greeter", Greeter.class);
//		String msg = g.greet("Donghwan");
//		System.out.println(msg);
//		System.out.println("(g == g1) = " + (g == g1));
//		ctx.close();
//	}

}
