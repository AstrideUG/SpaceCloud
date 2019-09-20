/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master

import de.astride.spacecloud.commons.config.createConfigs
import de.astride.spacecloud.commons.handlers.FingerprintsHandler
import de.astride.spacecloud.master.global.generateFiles
import de.astride.spacecloud.master.server.Server
import de.astride.spacecloud.master.global.groups
import de.astride.spacecloud.commons.config.groups as groupsConfig

object SpaceMaster {

    fun startup() {

        generateFiles()
        createConfigs()
        groups += groupsConfig.groups

        Server()

        FingerprintsHandler.calculate()
        FingerprintsHandler.save()

    }

}
