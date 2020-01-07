package main;

public class StudentOn20 extends StudentAbstract {

    public double getScore(){
        Result res = new WeightedMean((Result[]) grades.toArray(), (Integer[])coefficients.toArray());
//        double sum = 0;
//        double totalCoef = 0;
//
//        for (int index = 0; index < grades.size(); index++) {
////            if (grades.get(index).isDEF())
////                return -1.0;
////            sum+=grades.get(index).note*coefficients.get(index);
//            totalCoef += coefficients.get(index);
        //}
        return res.getScore();
    }
    @Override
    public void print(){
        System.out.println(studentName);
        for (int i = 0; i < grades.size(); i++) {
            //if (grades.get(i).isDEF())
            //    System.out.println(couseName.get(i) + " DEF");
            //else
            System.out.println(couseName.get(i) + " " + grades.get(i).getScore()+"/20");
        }
    }
}
