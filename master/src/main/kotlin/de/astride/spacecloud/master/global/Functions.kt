/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.global

import de.astride.spacecloud.commons.global.dataFolderName
import de.astride.spacecloud.commons.global.templatesFolderName
import de.astride.spacecloud.commons.global.userDataFolderName
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData.Companion.createFoldersIfNotExists
import java.io.File

fun generateFiles(rootDir: File = de.astride.spacecloud.commons.global.rootDir) {
    val templates = rootDir.resolve(templatesFolderName)
    createFoldersIfNotExists(templates.resolve(globalFolderName).resolve("plugins"))
    createFoldersIfNotExists(templates.resolve(localFolderName))
    val data = rootDir.resolve(dataFolderName)
    createFoldersIfNotExists(data)
    createFoldersIfNotExists(data.resolve(userDataFolderName))
}