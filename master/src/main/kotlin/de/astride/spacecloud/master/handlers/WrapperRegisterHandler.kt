/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.console.BLUE
import de.astride.spacecloud.commons.console.CYAN_BRIGHT
import de.astride.spacecloud.commons.console.RESET
import de.astride.spacecloud.commons.global.design
import de.astride.spacecloud.commons.packets.WrapperRegisterPacket
import de.astride.spacecloud.master.global.wrappers
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod
import kotlin.reflect.full.memberProperties

class WrapperRegisterHandler : PacketHandler {

    @PacketHandlerMethod
    fun onWrapperRegister(context: NetFramePacketContext, packet: WrapperRegisterPacket) {
        println("Wrapper".design())
        val wrapper = packet.wrapper
        if (wrapper != null) {

            val last = wrappers.lastOrNull()
            val id = (last?.id ?: 0) +1
            @Suppress("NAME_SHADOWING")
            val wrapper = wrapper.copy(id)
            wrappers += wrapper
            wrapper.printProperties()

        } else println(wrapper)
        println("Wrapper".design())
    }

}

private fun Any.printProperties() = this::class.memberProperties.forEach {
    val call = it.getter.call(this)
    println("$CYAN_BRIGHT${it.name.toUpperCase()}: $BLUE$call$RESET")
}