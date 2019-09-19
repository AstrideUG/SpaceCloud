/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper.server

import de.astride.spacecloud.commons.config.networkConfig
import de.astride.spacecloud.commons.config.toNetFrameConfig
import de.astride.spacecloud.commons.packets.StartServerPacket
import de.astride.spacecloud.commons.protocol.SpaceCloudProtocol
import de.piinguiin.netframe.client.NetFrameClientFactory
import de.piinguiin.netframe.commons.protocol.Protocol

class Wrapper {

    init {

        val protocol: Protocol = SpaceCloudProtocol()
        val config = networkConfig.toNetFrameConfig(protocol)
        val client = NetFrameClientFactory.createNetFrameClient(config)
        client.connect()
        client.sendPacket(StartServerPacket())


    }

}