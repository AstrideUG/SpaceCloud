/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.config

import de.piinguiin.netframe.commons.config.NetFrameConfig
import de.piinguiin.netframe.commons.protocol.Protocol
import net.darkdevelopers.darkbedrock.darkness.general.configs.default

/**
 * Created on 17.09.2019 22:27.
 * @author Lars Artmann | LartyHD
 */
class NetworkConfig(values: Map<String, Any?>) {
	val host by values.default { "localhost" }
	val port by values.default { 11599 }
}

fun NetworkConfig.toNetFrameConfig(protocol: Protocol): NetFrameConfig = NetFrameConfig.newBuilder()
		.setServerHost(host)
		.setServerPort(port)
		.setProtocol(protocol)
		.createNetFrameConfig()