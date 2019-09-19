/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master

import de.astride.spacecloud.commons.config.createConfigs
import de.astride.spacecloud.master.server.Server

object SpaceMaster {

    fun startup() {

        createConfigs()
        Server()

    }

}
