package service.strategy;

import model.Tuple;

import java.util.List;
import java.util.logging.Logger;

public class DisjointCompartmentsStrategy implements Strategy {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public Integer apply(List<Tuple> tupleList) {
        log.info("[DisjointCompartmentsStrategy] - applying strategy");
        for (int i = 0; i < tupleList.size() - 1; i++) {
            for (int b = i + 1; b < tupleList.size(); b++) {
                if (hasCommonPart(tupleList.get(i), tupleList.get(b))) {
                    tupleList.set(i, joinTuples(tupleList.get(i), tupleList.get(b)));
                    tupleList.remove(b);
                    b--;
                }
            }
        }
        return tupleList.size();
    }

    private boolean hasCommonPart(Tuple t1, Tuple t2) {
        log.info("[DisjointCompartmentsStrategy] - Finding common part");
        return Math.max(t1.right(), t2.right()) - Math.min(t1.left(), t2.left()) < (t1.right() - t1.left()) + (t2.right() - t2.left());
    }

    private Tuple joinTuples(Tuple t1, Tuple t2) {
        log.info("[DisjointCompartmentsStrategy] - Joining two Tuples");
        return new Tuple(
                Math.min(t1.left(), t2.left()),
                Math.max(t1.right(), t2.right())
        );
    }
}
