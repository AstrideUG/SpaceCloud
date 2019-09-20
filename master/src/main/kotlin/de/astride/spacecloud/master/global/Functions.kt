/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.global

import de.astride.spacecloud.commons.global.templatesFolderName
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData
import net.darkdevelopers.darkbedrock.darkness.general.functions.toConfigData
import java.io.File

fun generateFiles(rootDir: File = de.astride.spacecloud.commons.global.rootDir) {

    "fingerprint".toConfigData(rootDir, prefix = ".")
    val templates = rootDir.resolve(templatesFolderName)
    ConfigData.createFoldersIfNotExists(templates.resolve(globalFolderName).resolve("plugins"))
    ConfigData.createFoldersIfNotExists(templates.resolve(localFolderName))

}