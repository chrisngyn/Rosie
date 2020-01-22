import chrisngyn.github.rosie.CommandsHandler;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {

        // Read Discord token from file and build
        String fileName = "discordToken.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String token = bufferedReader.readLine();
        JDA build = new JDABuilder(token).build();
        bufferedReader.close();
        fileReader.close();

//        build.addEventListener(new FeatureHelp());
//        build.addEventListener(new FeatureArithmetic());
//        build.addEventListener(new FeatureRNG());
//        build.addEventListener(new FeatureReminder());
//        build.addEventListener(new FeatureReddit());
//        build.addEventListener(new FeatureGoogleSearch());
//        build.addEventListener(new FeatureTODO());

        // EventListener - tells JDA that I want to be listening to events and transmitting data to my CommandsHandler class
        build.addEventListener(new CommandsHandler());
    }
}