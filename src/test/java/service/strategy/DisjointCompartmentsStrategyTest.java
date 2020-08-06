package service.strategy;

import model.Tuple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<Tuple> given = createSampleTestData_1();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(3, result);
    }

    @DisplayName("Test sample Scenario 2")
    @Test
    void test_2() {
        // given
        List<Tuple> given = createSampleTestData_2();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Test sample Scenario 3")
    @Test
    void test_3() {
        // given
        List<Tuple> given = createSampleTestData_3();
        // when
        Integer result = strategy.apply(given);
        // then
        Assertions.assertEquals(1, result);
    }

    private List<Tuple> createSampleTestData_1() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,3));
        list.add(new Tuple(4,6));
        list.add(new Tuple(7,9));

        return list;
    }

    private List<Tuple> createSampleTestData_2() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,4));
        list.add(new Tuple(3,6));
        list.add(new Tuple(7,9));

        return list;
    }

    private List<Tuple> createSampleTestData_3() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,8));
        list.add(new Tuple(4,6));
        list.add(new Tuple(7,9));

        return list;
    }

}