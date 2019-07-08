package de.ham.examination;

public class Operator {

    public boolean LogicOperators() {
        Double D = 15d;
        double d = 7d;

        if (D == d) {
            return true;
        }

        float f = 7f;
        if (d == f) {
            return true;
        }

        d = f;

        long l = 15l;
        int i = 7;

        if (l == i) {
            return true;
        }

        if (d == l) {
            return true;
        }

        return false;
    }
}
