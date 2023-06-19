package donghwan.sp5.chap04.spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter memberPrinter;

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(eachMember -> memberPrinter.print(eachMember));
    }

    @Autowired
    public void setMemberDao (MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Autowired
    @Qualifier("printer")
    public void setMemberPrinter (MemberPrinter memberPrinter) {
        this.memberPrinter = memberPrinter;
    }
}
