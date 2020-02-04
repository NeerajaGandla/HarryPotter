package com.neeraja.harrypotter.presentation.mapper;

import com.neeraja.harrypotter.domain.entities.MemberEntity;
import com.neeraja.harrypotter.presentation.models.Member;

public class MemberEntityMapper implements Mapper<MemberEntity, Member> {
    @Override
    public MemberEntity from(Member member) {
        return new MemberEntity(member.getName(), member.getId());
    }

    @Override
    public Member to(MemberEntity memberEntity) {
        return new Member(memberEntity.getName(), memberEntity.getId());
    }
}
