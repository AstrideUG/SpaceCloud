/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper.global


import de.astride.spacecloud.commons.global.templatesFolderName
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData.Companion.createFoldersIfNotExists
import net.darkdevelopers.darkbedrock.darkness.general.functions.toConfigData
import java.io.File

fun generateFiles(rootDir: File = de.astride.spacecloud.commons.global.rootDir): Unit {

    createFoldersIfNotExists(rootDir.resolve(templatesFolderName))
    createFoldersIfNotExists(rootDir.resolve(tempFolderName))

}