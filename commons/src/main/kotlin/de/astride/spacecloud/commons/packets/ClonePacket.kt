/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

@NetFramePacketMeta(id = 15)
class ClonePacket : NetFramePacket {

    private var fileName: String = null
    private val content: ByteArray = null

    override fun read(buffer: NetFrameBuffer) {
        fileName = buffer.readString()
        buffer.readBytes(content)
    }

    override fun write(buffer: NetFrameBuffer) {
        buffer.writeString(fileName)
        buffer.writeBytes(content)
    }

}