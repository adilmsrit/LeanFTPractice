package Mala;

import cucumber.api.java.it.Ma;

public class Project {

    public static void main(String... args) {
        Interviewer interviewer = new Manager();
        interviewer.submitInterviewStatus();

        Manager manager = new Manager();
        manager.submitInterviewStatus();
    }
}
