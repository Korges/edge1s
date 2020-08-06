package service.strategy;

import model.Tuple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.SampleTestDataGenerator;

import java.util.List;

class DisjointCompartmentsStrategyTest {
    private Strategy strategy;

    @BeforeEach
    void setUp() {
        this.strategy = new DisjointCompartmentsStrategy();
    }

    @DisplayName("Test sample Scenario 1")
    @Test
    void test() {
        // given
        List<Tuple> given = SampleTestDataGenerator.createSampleTestData_1();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(3, result);
    }

    @DisplayName("Test sample Scenario 2")
    @Test
    void test_2() {
        // given
        List<Tuple> given = SampleTestDataGenerator.createSampleTestData_2();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Test sample Scenario 3")
    @Test
    void test_3() {
        // given
        List<Tuple> given = SampleTestDataGenerator.createSampleTestData_3();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(1, result);
    }

}