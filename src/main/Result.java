package main;

import strategy.Printer;

public interface Result {
    double getScore();
    String accept(Printer printer);
}
