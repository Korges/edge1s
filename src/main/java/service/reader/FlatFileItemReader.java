package service.reader;

import model.Tuple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlatFileItemReader implements ItemReader {
    private final String filePath;

    public FlatFileItemReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Tuple> read() {
        List<Tuple> tupleList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (String s; (s = br.readLine()) != null;) {
                tupleList.add(parseLine(s));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tupleList;
    }

    private Tuple parseLine(String line) {
        String[] array = line.split(",");
        return new Tuple(
                Integer.valueOf(array[0]),
                Integer.valueOf(array[1])
        );
    }
}
