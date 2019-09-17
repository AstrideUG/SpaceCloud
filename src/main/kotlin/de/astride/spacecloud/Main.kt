/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud


const val header: String = """
 _______  _______  _______  _______  _______  _______  _        _______           ______  
(  ____ \(  ____ )(  ___  )(  ____ \(  ____ \(  ____ \( \      (  ___  )|\     /|(  __  \ 
| (    \/| (    )|| (   ) || (    \/| (    \/| (    \/| (      | (   ) || )   ( || (  \  )
| (_____ | (____)|| (___) || |      | (__    | |      | |      | |   | || |   | || |   ) |
(_____  )|  _____)|  ___  || |      |  __)   | |      | |      | |   | || |   | || |   | |
      ) || (      | (   ) || |      | (      | |      | |      | |   | || |   | || |   ) |
/\____) || )      | )   ( || (____/\| (____/\| (____/\| (____/\| (___) || (___) || (__/  )
\_______)|/       |/     \|(_______/(_______/(_______/(_______/(_______)(_______)(______/ 
                                                                                          
"""

fun main() {

    println(header)
    SpaceCloud.startup()

}