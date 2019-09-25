/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

@NetFramePacketMeta(id = 8)
class OnlineRequestPacket @JvmOverloads constructor(var name: String? = null) : NetFramePacket {

    override fun read(buffer: NetFrameBuffer?) {
        name = buffer?.readString()
    }

    override fun write(buffer: NetFrameBuffer?) {
        // buffer?.writeBoolean(wrapperManager.contains)
    }

}