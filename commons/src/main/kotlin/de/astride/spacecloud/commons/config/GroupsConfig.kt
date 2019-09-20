/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.config

import de.astride.spacecloud.commons.wrapper.group.Group
import de.astride.spacecloud.commons.wrapper.group.GroupType
import net.darkdevelopers.darkbedrock.darkness.general.configs.default
import java.lang.Math.pow
import kotlin.math.pow

class GroupsConfig(values: Map<String, Any?>) {
    val groups by values.default { setOf(Group("TestServer", "spongevanilla-1.12.2-7.1.6.jar")) }
}