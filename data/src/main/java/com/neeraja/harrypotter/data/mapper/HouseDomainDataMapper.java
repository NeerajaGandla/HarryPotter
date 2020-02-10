package com.neeraja.harrypotter.data.mapper;

import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.data.models.MemberData;
import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.entities.MemberEntity;

import java.lang.reflect.Member;
import java.util.List;

import javax.inject.Inject;

public class HouseDomainDataMapper implements Mapper<HouseEntity, HouseData> {
    @Inject
    public HouseDomainDataMapper() {

    }
    MemberDomainDataMapper mapper = new MemberDomainDataMapper();
    @Override
    public HouseEntity from(HouseData obj) {
        MemberData[] memberDataList = obj.getMembers();
        MemberEntity[] memberEntities = new MemberEntity[memberDataList.length];
        for (int i = 0; i < memberDataList.length; i++) {
            memberEntities[i] = mapper.from(memberDataList[i]);
        }
         return new HouseEntity(obj.getId(), obj.getName(), obj.getMascot(),
                obj.getHeadOfHouse(), obj.getHouseGhost(), obj.getFounder(),
                obj.get__v(), obj.getSchool(), memberEntities, obj.getValues(), obj.getColors());
    }

    @Override
    public HouseData to(HouseEntity obj) {
        MemberEntity[] memberEntities = obj.getMembers();
        MemberData[] memberDataList = new MemberData[memberEntities.length];
        for (int i = 0; i < memberDataList.length; i++) {
            memberDataList[i] = mapper.to(memberEntities[i]);
        }
        return new HouseData(obj.getId(), obj.getName(), obj.getMascot(),
                obj.getHeadOfHouse(), obj.getHouseGhost(), obj.getFounder(),
                obj.get__v(), obj.getSchool(), memberDataList, obj.getValues(), obj.getColors());
    }
}
