package donghwan.sp5.chap05.config;

import donghwan.sp5.chap05.spring.MemberPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(AppCtx2.class)
public class AppCtx1 {

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        System.out.println("** memberPrinter1 is called!");
        return new MemberPrinter();
    }


}
