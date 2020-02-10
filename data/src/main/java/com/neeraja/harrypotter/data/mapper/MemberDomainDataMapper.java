package com.neeraja.harrypotter.data.mapper;

import com.neeraja.harrypotter.data.models.MemberData;
import com.neeraja.harrypotter.domain.entities.MemberEntity;

import javax.inject.Inject;

public class MemberDomainDataMapper implements Mapper<MemberEntity, MemberData> {
    @Inject
    public MemberDomainDataMapper() {

    }
    @Override
    public MemberEntity from(MemberData obj) {
        return new MemberEntity(obj.getName(), obj.getId());
    }

    @Override
    public MemberData to(MemberEntity obj) {
        return new MemberData(obj.getName(), obj.getId());
    }
}
