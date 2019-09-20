/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.wrapper

import de.astride.spacecloud.commons.config.createConfigs
import de.astride.spacecloud.wrapper.server.Client

object SpaceWrapper {

    fun startup() {

        createConfigs()
        Client()

    }

}
