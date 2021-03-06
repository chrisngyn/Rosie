package chrisngyn.github.rosie.commands;

import chrisngyn.github.rosie.Command;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class ServerInvite extends Command {
    protected String documentation = "**!serverinvite** - generate an invitation link to this server that expires in 10 minutes.";

    public ServerInvite() {
        super("serverinvite");
    }

    @Override
    public void execute(GuildMessageReceivedEvent event, String[] args) {
        String serverUrl = event.getChannel().createInvite().setMaxAge(600).complete().getUrl();
        event.getChannel().sendMessage("This link will expire in 10 minutes: " + serverUrl).queue();
    }
}