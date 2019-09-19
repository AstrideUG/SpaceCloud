/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.protocol

import de.astride.spacecloud.commons.packets.PingPacket
import de.astride.spacecloud.commons.packets.StartServerPacket
import de.astride.spacecloud.commons.packets.StopServerPacket
import de.piinguiin.netframe.commons.protocol.Protocol

class SpaceCloudProtocol : Protocol() {

   init {

      registerPacket(PingPacket::class.java)
      registerPacket(StartServerPacket::class.java)

   }

}