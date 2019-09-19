/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

@Suppress("EXPERIMENTAL_API_USAGE")
@NetFramePacketMeta(id = 3)
class PingPacket : NetFramePacket {

    @Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")
    var id: UInt = 0u

    override fun read(buffer: NetFrameBuffer) {
        id = buffer.readUnsignedInt().toUInt()
    }

    override fun write(buffer: NetFrameBuffer) {
        buffer.writeLong(id.toLong())
    }

}