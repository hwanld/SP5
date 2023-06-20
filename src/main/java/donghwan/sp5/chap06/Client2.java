package donghwan.sp5.chap06;

import lombok.Setter;

@Setter
public class Client2 {

    private String host;

    public void connect() {
        System.out.println("Client2.connect() 실행");
    }

    public void send() {
        System.out.println("Client2.send() to " + host);
    }

    public void close() {
        System.out.println("Client2.close() 실행");
    }
}
