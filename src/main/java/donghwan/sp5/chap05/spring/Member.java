package donghwan.sp5.chap05.spring;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Member {
    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime registerDateTime;

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password = newPassword;
    }

    public Member (String email, String password, String name, LocalDateTime registerDateTime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDateTime = registerDateTime;
    }
}
