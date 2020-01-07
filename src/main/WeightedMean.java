package main;

import strategy.Printer;

public class WeightedMean implements Result {
    Result[] grades;
    Integer[] coeffs;

    public Integer getCoeffsSize(){
        return coeffs.length;
    }

    public Integer getCoeffs(int i) {
        return coeffs[i];
    }

    public Result getGrades(int i) {
        return grades[i];
    }

    public WeightedMean(Result[] grades, Integer[] coeffs) {
        this.grades = grades;
        this.coeffs = coeffs;
    }

    @Override
    public double getScore() {
        double res= 0;
        int sum = 0;

        for (int index = 0; index < this.grades.length; index++) {
            res += grades[index].getScore()*coeffs[index];
            sum += coeffs[index];
        }
        return res/sum;
    }

    @Override
    public String accept(Printer printer) {
        return printer.visit(this);
    }


}
