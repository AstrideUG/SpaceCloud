/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master

import de.astride.spacecloud.commons.global.header
import de.astride.spacecloud.commons.global.separatorLine
import kotlin.system.measureTimeMillis

fun main() {

    println(header)
    println("Starting up master...")
    println(separatorLine)
    val millis = measureTimeMillis { SpaceMaster.startup() }
    println(separatorLine)
    println("Started master (in ${millis}ms)")

}