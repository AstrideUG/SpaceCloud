/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.astride.spacecloud.commons.packets.StartServerPacket
import de.piinguiin.netframe.commons.protocol.context.NetFramePacketContext
import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

class ServerStartHandler : PacketHandler {

    @PacketHandlerMethod
    fun onStartServer(con: NetFramePacketContext, packet: StartServerPacket) {
        println("Hallo")
        println(con)
        println(packet)
        con.answer(packet)
    }


}