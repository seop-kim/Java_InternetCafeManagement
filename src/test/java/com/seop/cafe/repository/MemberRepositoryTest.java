package com.seop.cafe.repository;

import static com.seop.cafe.domain.Gender.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.seop.cafe.domain.Member;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {
    private static final MemberRepository repository = MemberRepository.getInstance();


    @BeforeEach
    void setup() {
        createMember();
    }

    @AfterEach
    void clean() {
        repository.clear();
    }

    @DisplayName("회원 추가")
    @Test
    void save() {
        // given
        Member member = new Member();
        member.setName("test");
        member.setAge(15);
        member.setRegiDate(LocalDateTime.now());
        member.setGender(MALE);

        // when
        Member saveMember = repository.save(member);

        // then
        assertThat(member)
                .isEqualTo(saveMember);
    }

    @DisplayName("회원 삭제")
    @Test
    void delete() {
        // given
        Long findNo = 1L;

        // when
        Member deleteMember = repository.delete(findNo);

        // then
        assertThat(deleteMember.getNo())
                .isEqualTo(findNo);

    }

    @DisplayName("이름 조회")
    @Test
    void findName() {
        // given
        String findName = "test0";
        int result = 1;

        // when
        List<Member> findMember = repository.findName(findName);
        int findMemberSize = findMember.size();

        // then
        assertThat(findMemberSize)
                .isEqualTo(result);
    }

    void createMember() {
        for (int i = 0; i < 10; i++) {
            Member member = new Member();
            member.setName("test" + i);
            member.setAge(15 + i);
            member.setRegiDate(LocalDateTime.now());
            member.setGender(MALE);

            repository.save(member);
        }
    }
}
