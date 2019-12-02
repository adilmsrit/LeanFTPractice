package Mala;

public interface Interviewer {
    default Object submitInterviewStatus() {
        System.out.println("Interviewer: Accepted");
        return null;
    }
}
