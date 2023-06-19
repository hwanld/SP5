package donghwan.sp5.chap03;

import lombok.Setter;

@Setter
public class ChangePasswordService {
    private MemberDao memberDao;

    public void changePassword (String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email);
        if (member == null) {
            throw new MemberNotFoundException();
        }
        member.changePassword(oldPwd, newPwd);
    }
}
