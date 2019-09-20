/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.global.design
import de.astride.spacecloud.commons.packets.WrapperRegisterPacket
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod
import kotlin.reflect.full.memberProperties

class WrapperRegisterHandler : PacketHandler {

    @PacketHandlerMethod
    fun onWrapperRegister(context: NetFramePacketContext, packet: WrapperRegisterPacket) {
        println("Wrapper".design())
        val wrapper = packet.wrapper
        if (wrapper != null) wrapper::class.memberProperties.forEach {
            println("${it.name.toUpperCase()}: ${it.getter.call(wrapper)}")
        } else println(wrapper)
        println("Wrapper".design())
    }

}