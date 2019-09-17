/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.server

import de.astride.spacecloud.commons.config.networkConfig
import de.astride.spacecloud.commons.config.toNetFrameConfig
import de.astride.spacecloud.commons.protocol.SpaceCloudProtocol
import de.astride.spacecloud.master.handlers.ServerCreateHandler
import de.astride.spacecloud.master.handlers.ServerStartHandler
import de.astride.spacecloud.master.handlers.ServerStopHandler
import de.astride.spacecloud.master.handlers.WrapperRegisterHandler
import de.piinguiin.netframe.commons.protocol.Protocol
import de.piinguiin.netframe.server.NetFrameServerFactory

class Server(host: String, ports: Int) {

    init {

        val protocol: Protocol = SpaceCloudProtocol().apply {
            registerListener(ServerStartHandler())
            registerListener(ServerStopHandler())
            registerListener(ServerCreateHandler())
            registerListener(WrapperRegisterHandler())
        }

        val config = networkConfig.toNetFrameConfig(protocol)

        val server = NetFrameServerFactory.createNetFrameServer(config)
        server.start()

    }

}