package com.jojiapp.jacocogradle.member.repository;

import com.jojiapp.jacocogradle.member.entity.*;
import org.springframework.data.jpa.repository.*;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
