package com.example.mike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.mike.entities.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByEmail(String email);

}