/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper

@Suppress("EXPERIMENTAL_API_USAGE")
data class Wrapper(
        val id: UInt,
        val ram: UInt, //in MB
        val ip: String
)