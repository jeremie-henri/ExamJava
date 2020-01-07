package strategy;

import main.Max;
import main.SimpleResult;
import main.WeightedMean;

public class XMLVisitor implements Printer {

    @Override
    public String visit(SimpleResult simpleResult) {
        return "<simpleresult> <grade>"+ simpleResult.getScore() + "</grade></simpleresult>";
    }

    @Override
    public String visit(WeightedMean weightedMean) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<weightedMean>");
        for (int i = 0; i < weightedMean.getCoeffsSize() ; i++) {
            stringBuilder.append(weightedMean.getGrades(i).accept(this));
            stringBuilder.append("<coeff>");
            stringBuilder.append(weightedMean.getCoeffs(i));
            stringBuilder.append("</coeff>");
        }
        stringBuilder.append("</weightedMean>");
        return stringBuilder.toString();
    }

    @Override
    public String visit(Max max) {
        return "<max>"+max.getR1().accept(this) + max.getR2().accept(this)+"</max>";
    }
}
