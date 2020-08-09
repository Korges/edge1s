
import service.FacadeServiceImpl;
import service.reader.FlatFileItemReader;
import service.strategy.DisjointCompartmentsStrategy;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        final Logger log = Logger.getLogger(Main.class.getName());
        verifyIsPathGiven(args);
        Integer result = new FacadeServiceImpl(
                new FlatFileItemReader(args[0]),
                new DisjointCompartmentsStrategy()
        ).result();
        log.info("\n---> RESULT : " + result);
    }

    private static void verifyIsPathGiven(String[] args) {
        if (args.length < 1) {
            throw new RuntimeException("File Path not specified");
        }
    }
}
