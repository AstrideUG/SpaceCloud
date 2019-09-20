/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.config

import de.astride.spacecloud.commons.global.configsFolderName
import de.astride.spacecloud.commons.global.rootDir
import de.astride.spacecloud.commons.global.templatesFolderName
import de.astride.spacecloud.commons.wrapper.group.Group
import de.astride.spacecloud.commons.wrapper.group.GroupType
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData
import net.darkdevelopers.darkbedrock.darkness.general.configs.createConfigs
import net.darkdevelopers.darkbedrock.darkness.general.configs.defaultMappings
import net.darkdevelopers.darkbedrock.darkness.general.functions.toConfigData
import java.io.File

/*
 * Created on 17.09.2019 22:33.
 * @author Lars Artmann | LartyHD
 */

lateinit var network: NetworkConfig
lateinit var groups: GroupsConfig

fun createConfigs() {
    addMappings()
    setOf(::network, ::groups).createConfigs(rootDir.resolve(configsFolderName)) }

@Suppress("UNCHECKED_CAST")
private fun addMappings() {
    defaultMappings += Group::class.java to mapping@{ any ->
        val map = any as? Map<String, Any?> ?: return@mapping null

        val name = map["name"].toString()
        val imageName = map["image-name"].toString()
        val ram = map["ram"].toString().toLongOrNull()
        val type = GroupType.values().find { it.name == map["type"].toString() }

        var group = Group(name, imageName)
        if (ram != null) group = group.copy(ram = ram)
        if (type != null) group = group.copy(type = type)

        group
    }
}
