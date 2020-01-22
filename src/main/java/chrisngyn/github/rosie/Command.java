package chrisngyn.github.rosie;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

public abstract class Command {

    // All commands are some form of command. All command classes will inherit this.

    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(GuildMessageReceivedEvent event, String[] args);
}