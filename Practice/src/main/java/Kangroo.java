public class Kangroo extends Marsupial {

    public boolean isBiped() {
        return true;
    }

    public void getKangrooDescription() {
        System.out.println("Kangroo hops on two legs  " + isBiped());
    }


    public static void main(String[] args) {
//        Kangroo joey = new Kangroo();
//        joey.getMarsupialDescription();
//        joey.getKangrooDescription();
        System.out.println(stringX("xxHxix"));
    }

    /*Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.*/

    public static String stringX(String str) {
        String result = "";

        if (str.substring(0,1).equals("x")&&str.substring(str.length()-1).equals("x")){
            result = str.substring(1,str.length());
        }


        return result;
    }

}

