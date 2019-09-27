package de.astride.spacecloud.commons.console.commands

abstract class Command(override var name: String, override var aliases: MutableList<String>) : ICommand {

    abstract fun execute(arguments: MutableList<String>) {
        exe
    }

}