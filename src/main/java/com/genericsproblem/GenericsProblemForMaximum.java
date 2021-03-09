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

    public String getStringMaximum(String str1, String str2, String str3) {
        if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0)
            return str1;
        else if (str2.compareTo(str3) > 0 && str2.compareTo(str1) > 0)
            return str2;
        else
            return str3;
    }
}
