/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.protocol

import de.astride.spacecloud.commons.handlers.PingHandler
import de.astride.spacecloud.commons.handlers.WhitelistHandler
import de.astride.spacecloud.commons.packets.PingPacket
import de.astride.spacecloud.commons.packets.StartServerPacket
import de.piinguiin.netframe.commons.protocol.Protocol

class SpaceCloudProtocol : Protocol() {

   init {

      registerPacket(PingPacket::class.java)
      registerPacket(StartServerPacket::class.java)
      registerListener(WhitelistHandler())
      registerListener(PingHandler())

   }

}