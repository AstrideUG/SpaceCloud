/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.packets

import com.mongodb.util.JSON
import de.piinguiin.netframe.commons.buffer.NetFrameBuffer
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket

class PlayerDataPacket @JvmOverloads constructor(var playerDataJson : JSON? = null) : NetFramePacket {

    override fun read(buffer: NetFrameBuffer?) {
        playerDataJson = buffer?.readObject() as? JSON
    }

    override fun write(buffer: NetFrameBuffer?) {
        buffer?.writeObject(playerDataJson)
    }

}