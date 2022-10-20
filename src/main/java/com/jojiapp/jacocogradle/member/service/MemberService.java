package com.jojiapp.jacocogradle.member.service;

import com.jojiapp.jacocogradle.member.entity.*;
import com.jojiapp.jacocogradle.member.repository.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Long save(boolean isTest) {

        if (isTest) {
            return memberRepository.save(new Member(null, "이름")).getId();
        }
        return 0L;
    }
}
