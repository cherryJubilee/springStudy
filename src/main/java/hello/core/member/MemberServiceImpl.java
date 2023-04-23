package hello.core.member;

public class MemberServiceImpl implements MemberService { //구현체가 한개 일 때 Impl을 붙여준다.
    //MemberRepository에 대한 내용만 있고,  MemberRepository에 대한 내용은 없다. = 추상화에만 의존 DI 지키기

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long MemberId) {
        return memberRepository.findById(MemberId);
        }
}
