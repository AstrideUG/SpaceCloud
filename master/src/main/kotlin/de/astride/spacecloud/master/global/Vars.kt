/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.global

import de.astride.spacecloud.commons.wrapper.Wrapper
import de.astride.spacecloud.commons.wrapper.group.Group

val ipWhitelist = mutableSetOf("localhost")
val wrappers = mutableSetOf<Wrapper>()
val groups = mutableSetOf<Group>()
