public class Office {

    public static void main(String... args) {
        HRExecutive hrExecutive = new HRExecutive();
        hrExecutive.specialization = new String[]{"Staffing"};
//        hrExecutive.conductInterview();
        hrExecutive.name = "Adil";

        Interviewer[] interviewer = new Interviewer[2];
        interviewer[0] = new Manager();
        interviewer[1] = new HRExecutive();

        interviewer[0].conductInterview();

        interviewer[1].conductInterview();


    }
}
