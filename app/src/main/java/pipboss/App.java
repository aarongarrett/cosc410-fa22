package pipboss;

import java.util.*;
import java.util.concurrent.Callable;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.Spec;



@Command(description = "Play PipBoss.",
         name = "pipboss", mixinStandardHelpOptions = true, version = "pipboss 1.0")
public class App implements Callable<Integer> {

    @Spec CommandSpec spec;


    @Command(name = "phase0", description = "Play the Phase 0 version of PipBoss")
    void phase0() {
        System.out.println("Hello World");
    }
    


    public static void main(String... args) throws Exception {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        throw new ParameterException(spec.commandLine(), "Specify a subcommand");
    }
}
