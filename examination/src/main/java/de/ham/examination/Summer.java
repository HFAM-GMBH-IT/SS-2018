package de.ham.examination;

import java.util.Collections;
import java.util.List;

public class Summer {
    public Integer sum(List<Integer> aListOfIntegers) {
        int sum = 0;
        // Ihre Implementierung bitte:

        for (int i = 0; i < aListOfIntegers.size(); i++) {
            sum = sum + aListOfIntegers.get(i);
            if (sum < 0) {
              break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Summer summer = new Summer();
        summer.sum(Collections.EMPTY_LIST);
    }
}

