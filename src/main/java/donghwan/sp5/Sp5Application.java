package donghwan.sp5;

import donghwan.sp5.chap04.config.AppCtx1;
import donghwan.sp5.chap04.spring.ChangePasswordService;
import donghwan.sp5.chap04.spring.MemberRegisterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sp5Application {
	private static ApplicationContext ctx = null;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppCtx1.class);
		MemberRegisterService memberRegisterService = ctx.getBean(MemberRegisterService.class);
		ChangePasswordService changePasswordService = ctx.getBean(ChangePasswordService.class);
		SpringApplication.run(Sp5Application.class, args);
	}


}
