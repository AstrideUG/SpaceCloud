/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper

import de.astride.spacecloud.commons.wrapper.server.Server
import java.io.Serializable
import java.net.SocketAddress

@Suppress("EXPERIMENTAL_API_USAGE")
data class Wrapper(
		val id: Int,
		val ram: Long, //in bytes
		val ip: SocketAddress,
		val servers: MutableSet<Server> = mutableSetOf()
) : Serializable