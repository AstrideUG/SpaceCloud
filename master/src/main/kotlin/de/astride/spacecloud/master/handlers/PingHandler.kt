/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.console.RED
import de.astride.spacecloud.commons.console.RESET
import de.astride.spacecloud.commons.console.UNDERLINE
import de.astride.spacecloud.commons.packets.PingPacket
import de.astride.spacecloud.master.global.wrappers
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

@Suppress("EXPERIMENTAL_API_USAGE")
class PingHandler : PacketHandler {

    @PacketHandlerMethod
    fun on(context: NetFramePacketContext, packet: PingPacket) {
        val remoteAddress = context.channelHandlerContext.channel().remoteAddress()
        val wrapper = wrappers.find { it.ip == remoteAddress }
        if (wrapper != null)
			println("Ping received form wrapper: ${wrapper.id}")
		else System.err.println(RED + UNDERLINE + "Ping received form unknown ip ($remoteAddress)!" + RESET)

    }

}