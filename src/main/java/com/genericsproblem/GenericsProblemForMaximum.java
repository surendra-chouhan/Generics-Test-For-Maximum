package com.genericsproblem;

public class GenericsProblemForMaximum {
    public Integer getIntMaximum(Integer num1, Integer num2, Integer num3 ) {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        else if (num2.compareTo(num3) > 0 && num2.compareTo(num1) > 0)
            return num2;
        else
            return num3;
    }

    public Double getDoubleMaximum(Double num1, Double num2, Double num3 ) {
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            return num1;
        else if (num2.compareTo(num3) > 0 && num2.compareTo(num1) > 0)
            return num2;
        else
            return num3;
    }
}
