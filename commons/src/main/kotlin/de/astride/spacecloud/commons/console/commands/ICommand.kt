package de.astride.spacecloud.commons.console.commands

interface ICommand {

    var name: String
    var aliases: MutableList<String>
    fun execute(arguments: MutableList<String>)

}