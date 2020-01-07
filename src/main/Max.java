package main;

import strategy.Printer;

public class Max implements Result {
    Result r1;
    Result r2;

    public Max(Result r1, Result r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Result getR1() {
        return r1;
    }

    public Result getR2() {
        return r2;
    }

    @Override
    public double getScore() {
        return Math.max(r1.getScore(),r2.getScore());
    }

    @Override
    public String accept(Printer printer) {
        return printer.visit(this);
    }
}
