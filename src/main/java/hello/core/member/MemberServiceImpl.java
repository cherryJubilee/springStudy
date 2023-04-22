package hello.core.member;

public class MemberServiceImpl implements MemberService { //구현체가 한개 일 때 Impl을 붙여준다.

    private final MemberRepository memberRepository = new MemoryMemberRepository();  // 구현객체

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long MemberId) {
        return memberRepository.findById(MemberId);
        }
}
