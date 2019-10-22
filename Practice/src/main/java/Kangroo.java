public class Kangroo extends Marsupial{

    public boolean isBiped() {
        return true;
    }

    public void getKangrooDescription(){
        System.out.println("Kangroo hops on two legs  " + isBiped());
    }


    public static void main(String[] args) {
        Kangroo joey = new Kangroo();
        joey.getMarsupialDescription();
        joey.getKangrooDescription();
    }
}
