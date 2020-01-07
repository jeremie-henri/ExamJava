package strategy;


import main.Max;
import main.Result;
import main.SimpleResult;
import main.WeightedMean;

public interface Printer {
    String visit(SimpleResult result);
    String visit(WeightedMean weightedMean);
    String visit(Max max);
}
