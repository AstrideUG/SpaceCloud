/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.handlers

import de.astride.spacecloud.commons.packets.PingPacket
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

@Suppress("EXPERIMENTAL_API_USAGE")
class PingHandler : PacketHandler {

	@PacketHandlerMethod
	fun on(context: NetFramePacketContext, packet: PingPacket) {
		println("Ping received form IP: ${context.channelHandlerContext.channel().remoteAddress()}")
	}

}