/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.packets.OnlineRequestPacket
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket

class OnlineRequestHandler : PacketHandler {

    @PacketHandlerMethod
    fun on(context: NetFramePacketContext, packet: OnlineRequestPacket) {
        println("Received OnlineRequest for: ${packet.name}")
    }

}