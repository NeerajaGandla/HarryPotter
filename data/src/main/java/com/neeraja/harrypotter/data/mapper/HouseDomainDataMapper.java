package com.neeraja.harrypotter.data.mapper;

import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.domain.entities.HouseEntity;

public class HouseDomainDataMapper implements Mapper<HouseEntity, HouseData> {
    @Override
    public HouseEntity from(HouseData obj) {
        return new HouseEntity(obj.getId(), obj.getName(), obj.getMascot(),
                obj.getHeadOfHouse(), obj.getHouseGhost(), obj.getFounder(),
                obj.get__v(), obj.getSchool(), obj.getMembers(), obj.getValues(), obj.getColors());
    }

    @Override
    public HouseData to(HouseEntity obj) {
        return new HouseData(obj.getId(), obj.getName(), obj.getMascot(),
                obj.getHeadOfHouse(), obj.getHouseGhost(), obj.getFounder(),
                obj.get__v(), obj.getSchool(), obj.getMembers(), obj.getValues(), obj.getColors());
    }
}
