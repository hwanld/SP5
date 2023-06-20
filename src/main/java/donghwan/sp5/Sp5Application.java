package donghwan.sp5;

import donghwan.sp5.chap07.Calculator;
import donghwan.sp5.chap07.CompCalculator;
import donghwan.sp5.chap07.ImpeCalculator;
import donghwan.sp5.chap07.RecCalculator;
import donghwan.sp5.chap07.config.AppCtx;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sp5Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		RecCalculator calculator = ctx.getBean("calculator", RecCalculator.class);
		long fiveFact = calculator.factorial(5);
		System.out.println("cal.factorial(5) = " + fiveFact);
		System.out.println(calculator.getClass().getName());

		System.out.println("----------------------------------------");

		Calculator compCalculator = ctx.getBean(CompCalculator.class);
		long anotherFiveFact = compCalculator.factorial(5);
		System.out.println("cal.factorial(5) = " + anotherFiveFact);
		System.out.println(compCalculator.getClass().getName());

		System.out.println("----------------------------------------");
		Calculator compCalculator1 = new ImpeCalculator();
		long anotherFiveFact1 = compCalculator1.factorial(5);
		System.out.println("cal.factorial(5) = " + anotherFiveFact);
		System.out.println(compCalculator1.getClass().getName());

		ctx.close();
	}
}
