package service.reader;

import model.Tuple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FlatFileItemReader implements ItemReader {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    private final String filePath;

    public FlatFileItemReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Tuple> read() {
        log.info("[FlatFileItemReader] - Started reading data from file in given path : \n" + filePath);
        List<Tuple> tupleList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (String s; (s = br.readLine()) != null;) {
                tupleList.add(parseLine(s));
            }
        } catch (IOException e) {
            log.warning(e.getMessage());
            throw new RuntimeException();
        }
        log.info("[FlatFileItemReader] - Reading has been finished");
        return tupleList;
    }

    private Tuple parseLine(String line) {
        log.info("[FlatFileItemReader] - Parsing line to single Tuple object : " + line);
        String[] array = line.split(",");
        return new Tuple(
                Integer.valueOf(array[0].trim()),
                Integer.valueOf(array[1].trim())
        );
    }
}
