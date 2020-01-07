package main;

import strategy.Printer;
import strategy.XMLVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentOn20 studentOn20 = new StudentOn20();
//        studentOn20.studentName = "ficuze";
//        studentOn20.grades.add(new main.Grade(20.0));
//        studentOn20.coefficients.add(6);
//        studentOn20.couseName.add("JAVA");
//
//        studentOn20.coefficients.add(6);
//        studentOn20.couseName.add("Systeme");
//        studentOn20.grades.add(new main.Grade(-1));p
//
//        studentOn20.getScore();
//        studentOn20.print();

        Result exam = new SimpleResult(12.0, "exam");
        Result projet = new SimpleResult(13.0, "projet");
        Result assignement = new SimpleResult(15.0, "assignement");
        Result examTerminal = new SimpleResult(10.0, "examterm");
        Result[] grades = {exam, assignement, projet};
        Integer [] coeff = {6, 2,2};
        Result weightedMean = new WeightedMean(grades, coeff);
        Max result = new Max (weightedMean, examTerminal);
        System.out.println(result.getScore());

        Printer printer = new XMLVisitor();
        System.out.println(printer.visit(result));

    }
}
