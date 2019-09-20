/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

@NetFramePacketMeta(id = 7)
class StopServerPacket : NetFramePacket {

    override fun read(buffer: NetFrameBuffer?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun write(buffer: NetFrameBuffer?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}