/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper.group

@Suppress("EXPERIMENTAL_API_USAGE")
data class Group(
        val name: String,
        val imageName: String,
        val ram: UInt,
        val type: GroupType
)
