/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

@NetFramePacketMeta(id = 4)
class StartServerPacket() : NetFramePacket {

    override fun read(buffer: NetFrameBuffer?) {
        println(buffer)
        println("TEST!")
        println("TEST!")
        println("TEST!")
        println("TEST!")
        println("TEST!")
        println("TEST!")
        println(buffer?.readString())
    }

    override fun write(buffer: NetFrameBuffer?) {
        buffer?.writeString("TEST")
        println(buffer)
        println("write luhjfdbkjghbfdrgkfdrjbdfjsgf!")
    }


}