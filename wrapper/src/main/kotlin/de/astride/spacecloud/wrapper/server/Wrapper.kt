/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper.server

import de.astride.spacecloud.commons.config.networkConfig
import de.astride.spacecloud.commons.config.toNetFrameConfig
import de.astride.spacecloud.commons.packets.PingPacket
import de.astride.spacecloud.commons.protocol.SpaceCloudProtocol
import de.astride.spacecloud.wrapper.handlers.ServerStartHandler
import de.piinguiin.netframe.client.NetFrameClient
import de.piinguiin.netframe.client.NetFrameClientFactory
import de.piinguiin.netframe.commons.protocol.Protocol
import kotlin.concurrent.thread

class Wrapper {

	private var isRunning = true

	init {

		val protocol: Protocol = SpaceCloudProtocol()
		protocol.registerListener(ServerStartHandler())

		val config = networkConfig.toNetFrameConfig(protocol)
		val client = NetFrameClientFactory.createNetFrameClient(config)
		client.connect()
		print("Wrapper started")

		client.startPining()

	}

	private fun NetFrameClient.startPining(delay: Long = 1000) {
		thread {
			val packet = PingPacket()
			while (isRunning) {
				sendPacket(packet)
				Thread.sleep(delay)
			}
		}
	}


}