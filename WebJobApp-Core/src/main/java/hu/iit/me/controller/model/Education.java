package hu.iit.me.controller.model;

public enum Education {
    MIDDLE_SCOOL(1),
    HIGH_SCHOOL(2),
    UNIVERSITY(3);

    private final int numval;

    Education(int numval) {
        this.numval = numval;
    }

    public int getNumval() {
        return numval;
    }
}
