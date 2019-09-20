/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper

import de.astride.spacecloud.commons.global.header
import de.astride.spacecloud.commons.global.separatorLine
import kotlin.system.measureTimeMillis


fun main() {

    println(header)
    println("Starting up wrapper...")
    println(separatorLine)
    val millis = measureTimeMillis { SpaceWrapper.startup() }
    println(separatorLine)
    println("Started wrapper (in ${millis}ms)")

}