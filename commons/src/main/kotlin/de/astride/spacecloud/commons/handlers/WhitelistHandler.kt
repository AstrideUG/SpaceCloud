/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.handlers

import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket

class WhitelistHandler: PacketHandler {

    fun on(context: NetFramePacketContext, packet: NetFramePacket) {
       println("Packet received form: ${context.channelHandlerContext.channel().remoteAddress()}")
    }

}