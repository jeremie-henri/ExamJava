package main;

public class StudentOn10 extends StudentAbstract {

    @Override
    public void print() {
        System.out.println(studentName);
        for (int index = 0; index < grades.size(); index++) {
            System.out.println(couseName.get(index)+ " " + grades.get(index) +"/10");
        }
    }
}
