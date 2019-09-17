/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.server

import de.astride.spacecloud.master.handlers.ServerCreateHandler
import de.astride.spacecloud.master.handlers.ServerStartHandler
import de.astride.spacecloud.master.handlers.ServerStopHandler
import de.astride.spacecloud.master.handlers.WrapperRegisterHandler
import de.astride.spacecloud.commons.protocol.SpaceCloudProtocol
import de.piinguiin.netframe.commons.config.NetFrameConfig
import de.piinguiin.netframe.commons.protocol.Protocol
import de.piinguiin.netframe.server.NetFrameServerFactory

class MainServer(host: String, ports: Int) {

    init {

        val protocol: Protocol = SpaceCloudProtocol().apply {
            registerListener(ServerStartHandler())
            registerListener(ServerStopHandler())
            registerListener(ServerCreateHandler())
            registerListener(WrapperRegisterHandler())
        }

        val config = NetFrameConfig.newBuilder()
                .setServerHost(host)
                .setServerPort(ports)
                .setProtocol(protocol)
                .createNetFrameConfig()

        val server = NetFrameServerFactory.createNetFrameServer(config)
        server.start()

    }

}