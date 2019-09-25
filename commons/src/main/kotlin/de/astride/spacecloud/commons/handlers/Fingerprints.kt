/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.handlers

import de.astride.spacecloud.commons.global.rootDir
import de.astride.spacecloud.commons.global.templatesFolderName
import net.darkdevelopers.darkbedrock.darkness.general.configs.ConfigData
import net.darkdevelopers.darkbedrock.darkness.general.functions.save
import net.darkdevelopers.darkbedrock.darkness.general.functions.sha256
import net.darkdevelopers.darkbedrock.darkness.general.functions.toConfigData
import net.darkdevelopers.darkbedrock.darkness.general.functions.toJsonObject
import java.io.File
import java.nio.file.Files
import java.nio.file.LinkOption

private val fingerprintsData = "fingerprints".toConfigData(rootDir, prefix = ".").apply { Files.setAttribute(file.toPath(), "dos:hidden", true, LinkOption.NOFOLLOW_LINKS); }
private val fingerprints = mutableMapOf<String, String>() //path, hash
private val baseDir get() = rootDir.resolve(templatesFolderName)

fun calculateFingerprints(baseFolder: File = baseDir) {
    println("calculateFingerprints ${baseFolder.absolutePath}")
    baseFolder.listFiles()?.forEach {
        if (it.isDirectory)
            calculateFingerprints(it)
        else fingerprints += it.path to it.fingerprint()
    }
    println("calculatedFingerprints $fingerprints")
}

fun saveFingerprints(configData: ConfigData = fingerprintsData) = configData.save(fingerprints.toJsonObject().apply { println(this) }.apply {
    println(configData.file.absolutePath)
    println(rootDir.absolutePath)
})

private fun File.fingerprint(): String = readText().sha256()
