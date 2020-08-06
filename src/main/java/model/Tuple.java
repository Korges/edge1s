package model;

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
}
