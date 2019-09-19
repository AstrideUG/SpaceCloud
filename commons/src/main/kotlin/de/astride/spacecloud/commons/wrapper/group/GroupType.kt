/*
 * © Copyright by Astride UG (haftungsbeschränkt) 2019.
 */

package de.astride.spacecloud.commons.wrapper.group

sealed class GroupType {

    object Dynamic: GroupType()
    object Static: GroupType()
//    object Stationary: GroupType()

}
