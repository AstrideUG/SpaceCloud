/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.global

import de.astride.spacecloud.commons.console.BLUE
import de.astride.spacecloud.commons.console.CYAN_BRIGHT
import de.astride.spacecloud.commons.console.RESET
import de.astride.spacecloud.commons.console.STRIKETHROUGH

/*
 * Created on 20.09.2019 19:30.
 * @author Lars Artmann | LartyHD
 */

private const val lineLength = 91

fun String.design(): String {
	val deleteLength = 4
	val length = lineLength.toFloat() - this.length - this.length % 2 - deleteLength
	val sideLength = (length / 2).toInt()
	val side = BLUE + STRIKETHROUGH + " ".repeat(sideLength) + RESET
	return "$side$CYAN_BRIGHT[ $this ]$side"
}
