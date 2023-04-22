package hello.core.member;

public interface MemberService {

    void join(Member member); //회원가입 기능

    Member findMember(Long MemberId); //회원조회 기능
}
