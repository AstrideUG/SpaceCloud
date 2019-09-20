/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.protocol

import de.astride.spacecloud.commons.handlers.PingHandler
import de.astride.spacecloud.commons.handlers.WhitelistHandler
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

      registerListener(WhitelistHandler())
      registerListener(PingHandler())

   }

   private inline fun <reified T : NetFramePacket> registerPacket(): Unit = registerPacket(T::class.java)

}