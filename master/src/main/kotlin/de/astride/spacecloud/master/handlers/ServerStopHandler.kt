/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.master.handlers

import de.piinguiin.netframe.commons.protocol.handler.PacketHandler
import de.piinguiin.netframe.commons.protocol.handler.PacketHandlerMethod

class ServerStopHandler : PacketHandler {

    @PacketHandlerMethod
    fun serverStop() {
        println(javaClass.simpleName)
    }

}