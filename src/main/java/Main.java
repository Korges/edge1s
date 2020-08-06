
import service.FacadeServiceImpl;
import service.reader.FlatFileItemReader;
import service.strategy.DisjointCompartmentsStrategy;

public class Main {

    public static void main(String[] args) {

        new FacadeServiceImpl(
                new FlatFileItemReader(args[0]),
                new DisjointCompartmentsStrategy()
        ).result();
        
    }
}