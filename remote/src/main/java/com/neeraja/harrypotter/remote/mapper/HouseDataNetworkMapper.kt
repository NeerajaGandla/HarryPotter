package com.neeraja.harrypotter.remote.mapper

import com.neeraja.harrypotter.data.models.HouseData
import com.neeraja.harrypotter.data.models.MemberData
import com.neeraja.harrypotter.remote.models.HouseNetwork
import com.neeraja.harrypotter.remote.models.MemberNetwork
import javax.inject.Inject

class HouseDataNetworkMapper @Inject constructor() : Mapper<HouseData, HouseNetwork> {
    val mapper: MemberDataNetworkMapper = MemberDataNetworkMapper()

    override fun from(e: HouseNetwork): HouseData {
        val members: Array<MemberNetwork> = e.members
        var memberDataList = arrayOf<MemberData>()
        for (i in members.indices) {
            val memberData: MemberData = mapper.from(members[i])
            memberDataList[i] = memberData
        }
        return HouseData(e.id, e.name, e.founder, e.headOfHouse,
                e.houseGhost, e.founder, e.__v, e.school, memberDataList , e.values, e.colors)
    }

    override fun to(t: HouseData): HouseNetwork {
        val members: Array<MemberData> = t.members
        var memberNetworkList = arrayOf<MemberNetwork>()
        for (i in members.indices) {
            val memberNetwork: MemberNetwork = mapper.to(members[i])
            memberNetworkList[i] = memberNetwork
        }
        return HouseNetwork(t.id, t.name, t.founder, t.headOfHouse,
                t.houseGhost, t.founder, t.__v, t.school, memberNetworkList , t.values, t.colors)
    }

}