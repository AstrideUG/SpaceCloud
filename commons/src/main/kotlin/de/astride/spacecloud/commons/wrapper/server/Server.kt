/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper.server

import de.astride.spacecloud.commons.wrapper.group.Group

@Suppress("EXPERIMENTAL_API_USAGE")
data class Server(
        val id: UInt,
        val port: UShort,
        val group: Group
)