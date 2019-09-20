/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.server

import de.astride.spacecloud.commons.config.network
import de.astride.spacecloud.commons.config.toNetFrameConfig
import de.astride.spacecloud.commons.protocol.SpaceCloudProtocol
import de.astride.spacecloud.master.handlers.PingHandler
import de.astride.spacecloud.master.handlers.ServerStartHandler
import de.astride.spacecloud.master.handlers.WhitelistHandler
import de.astride.spacecloud.master.handlers.WrapperRegisterHandler
import de.piinguiin.netframe.commons.protocol.Protocol
import de.piinguiin.netframe.server.NetFrameServerFactory

class Server {

    init {

        val protocol: Protocol = SpaceCloudProtocol().apply {
            registerListener(WhitelistHandler())
            registerListener(ServerStartHandler())
            registerListener(WrapperRegisterHandler())
            registerListener(PingHandler())
        }

        val config = network.toNetFrameConfig(protocol)
        val server = NetFrameServerFactory.createNetFrameServer(config)
        server.start()


    }

}