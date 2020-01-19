package chrisngyn.github.rosie;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Commands {

    private final String name;

    public Commands(String name) { this.name = name; }

    public abstract void execute(MessageReceivedEvent event, String[] args);
}