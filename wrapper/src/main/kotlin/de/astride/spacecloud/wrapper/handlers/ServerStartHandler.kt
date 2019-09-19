/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper.handlers

import de.astride.spacecloud.commons.packets.StartServerPacket
import de.piinguiin.netframe.commons.connection.NetFrameConnection
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

class ServerStartHandler : PacketHandler {

    @PacketHandlerMethod
    fun startServer(con : NetFramePacketContext, packet : StartServerPacket){
        println("Starting new server....")
    }

}