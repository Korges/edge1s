package service;

import model.Tuple;

import java.util.ArrayList;
import java.util.List;

public class SampleTestDataGenerator {

    public static List<Tuple> createSampleTestData_1() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,3));
        list.add(new Tuple(4,6));
        list.add(new Tuple(7,9));

        return list;
    }

    public static List<Tuple> createSampleTestData_2() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,4));
        list.add(new Tuple(3,6));
        list.add(new Tuple(7,9));

        return list;
    }

    public static List<Tuple> createSampleTestData_3() {
        List<Tuple> list = new ArrayList<>();
        list.add(new Tuple(1,8));
        list.add(new Tuple(4,6));
        list.add(new Tuple(7,9));

        return list;
    }
}
