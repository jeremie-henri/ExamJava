package main;

import strategy.Printer;

public class SimpleResult implements Result {
    double note;
    String description;

    SimpleResult(double note, String description){
        this.note = note;
        this.description = description;
    }

    @Override
    public double getScore() {
        return this.note;
    }

    @Override
    public String accept(Printer printer) {
        return printer.visit(this);
    }
}
