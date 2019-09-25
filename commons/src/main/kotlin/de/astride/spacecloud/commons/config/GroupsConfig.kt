/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.config

import de.astride.spacecloud.commons.wrapper.group.Group
import net.darkdevelopers.darkbedrock.darkness.general.configs.default

class GroupsConfig(values: Map<String, Any?>) {
    val groups by values.default { listOf(Group("TestServer", "spongevanilla-1.12.2-7.1.6.jar")) }
}