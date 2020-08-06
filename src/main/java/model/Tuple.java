package model;

import java.util.Objects;

public final class Tuple {
    private final Integer left;
    private final Integer right;

    public Tuple(Integer left, Integer right) {
        this.left = left;
        this.right = right;
    }

    public Integer left() {
        return left;
    }

    public Integer right() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Objects.equals(left, tuple.left) &&
                Objects.equals(right, tuple.right);
    }
}
