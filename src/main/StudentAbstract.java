package main;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentAbstract {
    String studentName;
    List<Result> grades = new ArrayList<Result>();
    List<Integer> coefficients = new ArrayList<Integer>();
    List<String> couseName = new ArrayList<String>();

    public abstract void print();
}
