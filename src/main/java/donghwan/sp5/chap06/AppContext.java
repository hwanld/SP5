package donghwan.sp5.chap06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {

    @Bean
    @Scope("prototype")
    public Client client() {
        Client client = new Client();
        client.setHost("Donghwan");
        return client;
    }

    @Bean(initMethod = "connect", destroyMethod = "close")
    @Scope("singleton")
    public Client2 client2() {
        Client2 client2 = new Client2();
        client2.setHost("Donghwan");
        return client2;
    }
}
