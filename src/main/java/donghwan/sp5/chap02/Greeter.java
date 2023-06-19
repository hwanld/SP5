package donghwan.sp5.chap02;

import lombok.Setter;

@Setter
public class Greeter {
    private String format;

    public String greet(String guest) {
        return String.format(format, guest);
    }

}
