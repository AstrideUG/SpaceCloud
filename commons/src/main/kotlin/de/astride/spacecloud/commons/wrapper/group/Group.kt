/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper.group

import kotlin.math.pow

@Suppress("EXPERIMENTAL_API_USAGE")
data class Group(
        val name: String,
        val imageName: String,
        val ram: Long = 1024.0.pow(3.0).toLong(),
        val type: GroupType = GroupType.DYNAMIC
)
