/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.global

import de.astride.spacecloud.commons.console.BLUE
import de.astride.spacecloud.commons.console.CYAN_BRIGHT
import de.astride.spacecloud.commons.console.RESET
import de.astride.spacecloud.commons.console.STRIKETHROUGH


const val header: String = """$CYAN_BRIGHT
 _______  _______  _______  _______  _______  _______  _        _______           ______  
(  ____ \(  ____ )(  ___  )(  ____ \(  ____ \(  ____ \( \      (  ___  )|\     /|(  __  \ 
| (    \/| (    )|| (   ) || (    \/| (    \/| (    \/| (      | (   ) || )   ( || (  \  )
| (_____ | (____)|| (___) || |      | (__    | |      | |      | |   | || |   | || |   ) |
(_____  )|  _____)|  ___  || |      |  __)   | |      | |      | |   | || |   | || |   | |
      ) || (      | (   ) || |      | (      | |      | |      | |   | || |   | || |   ) |
/\____) || )      | )   ( || (____/\| (____/\| (____/\| (____/\| (___) || (___) || (__/  )
\_______)|/       |/     \|(_______/(_______/(_______/(_______/(_______)(_______)(______/$RESET
"""
const val separatorLine: String = "$BLUE$STRIKETHROUGH                                                                                          $RESET"
const val templatesFolderName: String = "templates"
const val configsFolderName = "configs"
const val dataFolderName = "data"
const val userDataFolderName = "userdatas"