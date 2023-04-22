package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    // 회원 정보를 저장할 수 있는 store라는 HashMap 객체를 생성합니다.
    private static Map<Long, Member> store = new HashMap<>();  // store 이라는 저장소 만들기

    // save 메서드는 회원(Member) 객체를 매개변수로 받아서, store에 저장
    @Override
    public void save(Member member) {

        store.put(member.getId(), member);

    }
    // findById 메서드는 회원 아이디를 매개변수로 받아서, 해당 회원 정보를 store에서 찾아 반환합니다.
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
