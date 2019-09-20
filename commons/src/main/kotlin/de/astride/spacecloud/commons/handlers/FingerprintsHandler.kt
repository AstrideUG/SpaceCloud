/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.handlers

import de.astride.spacecloud.commons.global.rootDir
import de.astride.spacecloud.commons.global.templatesFolderName
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData
import net.darkdevelopers.darkbedrock.darkness.general.configs.toConfigMap
import net.darkdevelopers.darkbedrock.darkness.general.functions.save
import net.darkdevelopers.darkbedrock.darkness.general.functions.sha256
import net.darkdevelopers.darkbedrock.darkness.general.functions.toConfigData
import java.io.File
import java.io.FileReader
import java.util.*
import kotlin.concurrent.thread

object FingerprintsHandler {

    private val fingerprints = mutableMapOf<String, String>() //path, hash
    private val baseDir get() = rootDir.resolve(templatesFolderName)

    fun calculate(baseFolder: File = baseDir) {
        baseFolder.listFiles()?.forEach {
            if (it.isDirectory)
                calculate(it)
            else fingerprints += it.path to it.fingerprint()
        }
    }

    fun save(configData: ConfigData = "fingerprint".toConfigData(rootDir, prefix = ".")) =
            configData.save(fingerprints.toConfigMap())

    private fun File.fingerprint(): String = readText().sha256()

}