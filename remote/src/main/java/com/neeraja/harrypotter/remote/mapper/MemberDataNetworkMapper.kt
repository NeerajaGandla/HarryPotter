package com.neeraja.harrypotter.remote.mapper

import com.neeraja.harrypotter.data.models.MemberData
import com.neeraja.harrypotter.remote.models.MemberNetwork
import javax.inject.Inject

class MemberDataNetworkMapper @Inject constructor() : Mapper<MemberData, MemberNetwork> {
    override fun from(e: MemberNetwork): MemberData {
        return MemberData(e.name, e.id)
    }

    override fun to(t: MemberData): MemberNetwork {
        return MemberNetwork(t.name, t.id)
    }
}