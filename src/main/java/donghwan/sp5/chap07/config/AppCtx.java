package donghwan.sp5.chap07.config;

import donghwan.sp5.chap07.Calculator;
import donghwan.sp5.chap07.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"donghwan.sp5"})
public class AppCtx {

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
