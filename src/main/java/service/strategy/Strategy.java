package service.strategy;

import model.Tuple;

import java.util.List;

public interface Strategy {

    Integer apply(List<Tuple> tupleList);

}
