package main;

public class Grade {
    double note;

    Grade(double note) throws Exception {
        if (note < -1 || note > 20) throw new Exception("Borne");
        this.note = note;
    }

    public boolean isDEF(){
        return (note == -1);
    }
}
