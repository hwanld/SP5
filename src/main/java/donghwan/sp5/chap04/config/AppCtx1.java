package donghwan.sp5.chap04.config;

import donghwan.sp5.chap04.spring.MemberDao;
import donghwan.sp5.chap04.spring.MemberInfoPrinter;
import donghwan.sp5.chap04.spring.MemberPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppCtx2.class)
public class AppCtx1 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1() {
        System.out.println("** memberPrinter1 is called!");
        return new MemberPrinter();
    }

    @Bean
    public MemberInfoPrinter memberInfoPrinter() {
        return new MemberInfoPrinter();
    }

}
