package com.neeraja.harrypotter.presentation.mapper

import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.domain.entities.MemberEntity
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Member
import javax.inject.Inject

open class HouseEntityMapper @Inject constructor() : Mapper<HouseEntity, House> {
    val mapper: MemberEntityMapper = MemberEntityMapper()
    override fun from(e: House): HouseEntity {
        val members: Array<Member> = e.members
        var memberEntities = arrayOf<MemberEntity>()
        for (i in members.indices) {
            val memberEntity: MemberEntity = mapper.from(members[i])
            memberEntities[i] = memberEntity
        }
        return HouseEntity(e.id, e.name, e.mascot, e.headOfHouse, e.houseGhost,
                e.founder, e.__v, e.school, memberEntities, e.colors, e.values)
    }

    override fun to(e: HouseEntity): House {
        val memberEntities: Array<MemberEntity> = e.members
        var members = arrayOf<Member>()
        for (i in members.indices) {
            val member: Member = mapper.to(memberEntities[i])
            members[i] = member
        }
        return House(e.id, e.name, e.mascot, e.headOfHouse, e.houseGhost,
                e.founder, e.__v, e.school, members, e.colors, e.values)
    }

}