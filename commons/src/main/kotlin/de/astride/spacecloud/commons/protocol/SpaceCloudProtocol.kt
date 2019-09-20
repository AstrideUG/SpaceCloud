/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.protocol

import de.astride.spacecloud.commons.packets.OnlineRequestPacket
import de.astride.spacecloud.commons.packets.PingPacket
import de.astride.spacecloud.commons.packets.StartServerPacket
import de.astride.spacecloud.commons.packets.WrapperRegisterPacket
import de.piinguiin.netframe.commons.protocol.Protocol
import de.piinguiin.netframe.commons.protocol.packet.NetFramePacket

class SpaceCloudProtocol : Protocol() {

   init {

      registerPacket<PingPacket>()
      registerPacket<StartServerPacket>()
      registerPacket<WrapperRegisterPacket>()
      registerPacket<OnlineRequestPacket>()

   }

   private inline fun <reified T : NetFramePacket> registerPacket(): Unit = registerPacket(T::class.java)

}