/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.packets.StartServerPacket
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

class WrapperRegisterHandler : PacketHandler {



    @PacketHandlerMethod
    fun wrapperRegister(context: NetFramePacketContext, packet: StartServerPacket) {

    }

}