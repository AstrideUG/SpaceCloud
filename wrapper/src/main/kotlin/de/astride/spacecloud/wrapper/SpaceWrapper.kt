/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper

import de.astride.spacecloud.commons.config.createConfigs
import de.astride.spacecloud.commons.handlers.FingerprintsHandler
import de.astride.spacecloud.wrapper.global.generateFiles
import de.astride.spacecloud.wrapper.server.Client

object SpaceWrapper {

    fun startup() {

        generateFiles()
        createConfigs()

        Client()

        FingerprintsHandler.calculate()
        FingerprintsHandler.save()

    }

}
