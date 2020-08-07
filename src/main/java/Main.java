
import service.FacadeServiceImpl;
import service.reader.FlatFileItemReader;
import service.strategy.DisjointCompartmentsStrategy;

public class Main {

    public static void main(String[] args) {
        verifyIsPathGiven(args);
        new FacadeServiceImpl(
                new FlatFileItemReader(args[0]),
                new DisjointCompartmentsStrategy()
        ).result();
    }

    private static void verifyIsPathGiven(String[] args) {
        if (args.length < 1) {
            throw new RuntimeException("File Path not specified");
        }
    }
}
