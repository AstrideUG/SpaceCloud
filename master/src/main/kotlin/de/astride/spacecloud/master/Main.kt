/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master

import de.astride.spacecloud.commons.header

fun main() {

    println(header)
    println("Starting up master...")
    SpaceMaster.startup()

}