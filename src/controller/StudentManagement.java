package controller;

import common.Library;
import common.AlgorithmStudent;
import view.Menu;

public class StudentManagement extends Menu<String> {

    static String[] mc = {"Display GUI, Input Data And Perform function", "Exit"};

    protected Library library;
    protected AlgorithmStudent algorithm;

    public StudentManagement() {
        super("====== Collection Sort Program ======", mc);
        library = new Library();
        algorithm = new AlgorithmStudent();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.display();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
