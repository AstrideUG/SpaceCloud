/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.config

import net.darkdevelopers.darkbedrock.darkness.general.configs.createConfigs
import java.io.File

/*
 * Created on 17.09.2019 22:33.
 * @author Lars Artmann | LartyHD
 */

val configsFolder = File("configs")

lateinit var networkConfig: NetworkConfig


fun createConfigs(): Unit = setOf(::networkConfig).createConfigs(configsFolder)