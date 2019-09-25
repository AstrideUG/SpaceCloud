/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master

import de.astride.spacecloud.commons.config.createConfigs
import de.astride.spacecloud.commons.handlers.calculateFingerprints
import de.astride.spacecloud.commons.handlers.saveFingerprints
import de.astride.spacecloud.master.global.generateFiles
import de.astride.spacecloud.master.global.groups
import de.astride.spacecloud.master.server.Server
import de.astride.spacecloud.commons.config.groups as groupsConfig

object SpaceMaster {

    fun startup() {

        generateFiles()
        createConfigs()
        groups += groupsConfig.groups

        Server()

        calculateFingerprints()
        saveFingerprints()

    }

}
