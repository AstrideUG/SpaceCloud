/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.astride.spacecloud.commons.wrapper.Wrapper
import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta

/**
 * Created on 20.09.2019 15:16.
 * @author Lars Artmann | LartyHD
 */
@NetFramePacketMeta(id = 4)

class WrapperRegisterPacket @JvmOverloads constructor(var wrapper: Wrapper? = null) : NetFramePacket {

	override fun read(buffer: NetFrameBuffer) {
		wrapper = buffer.readObject() as? Wrapper
	}

	override fun write(buffer: NetFrameBuffer) {
		buffer.writeObject(wrapper)
	}

}