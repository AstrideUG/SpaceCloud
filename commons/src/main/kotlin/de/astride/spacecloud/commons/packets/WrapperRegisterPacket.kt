/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import de.astride.spacecloud.commons.wrapper.Wrapper
import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacketMeta
import io.netty.channel.ChannelHandlerContext
import kotlin.math.max
import kotlin.random.Random

/**
 * Created on 20.09.2019 15:16.
 * @author Lars Artmann | LartyHD
 */
@NetFramePacketMeta(id = 4)

class WrapperRegisterPacket @JvmOverloads constructor(var wrapper: Wrapper? = null) : NetFramePacket {

    override fun read(buffer: NetFrameBuffer, channelHandlerContext: ChannelHandlerContext) {
        val ram = buffer.readLong()
        wrapper = Wrapper(-1, ram, channelHandlerContext.channel().remoteAddress())
    }

    override fun write(buffer: NetFrameBuffer) {
        val maxMemory = Runtime.getRuntime().maxMemory()
        println(maxMemory)
        buffer.writeLong(maxMemory)
    }

    //not used
    override fun read(buffer: NetFrameBuffer) {}

}
