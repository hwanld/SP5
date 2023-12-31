package donghwan.sp5.chap03;

import lombok.AllArgsConstructor;

import java.util.Collection;

@AllArgsConstructor
public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter memberPrinter;

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(eachMember -> memberPrinter.print(eachMember));
    }
}
