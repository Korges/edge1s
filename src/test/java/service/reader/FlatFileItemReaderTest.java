package service.reader;

import model.Tuple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.SampleTestDataGenerator;

import java.util.List;

class FlatFileItemReaderTest {
    private ItemReader itemReader;

    @Test
    void test() {
        // given
        this.itemReader = new FlatFileItemReader("src/test/resources/file.txt");
        List<Tuple> expected = SampleTestDataGenerator.createSampleTestData_1();
        // when
        List<Tuple> result = itemReader.read();
        // then
        Assertions.assertIterableEquals(expected, result);
    }

}