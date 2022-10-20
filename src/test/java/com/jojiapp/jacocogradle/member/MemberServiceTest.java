package com.jojiapp.jacocogradle.member;

import com.jojiapp.jacocogradle.member.service.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    void saveTrue() throws Exception {

        // Given

        // When
        Long memberId = memberService.save(true);

        // Then
        Assertions.assertThat(memberId).isEqualTo(1L);
    }

    @Test
    void saveFalse() throws Exception {

        // Given

        // When
        Long memberId = memberService.save(false);

        // Then
        Assertions.assertThat(memberId).isEqualTo(0L);
    }

}
