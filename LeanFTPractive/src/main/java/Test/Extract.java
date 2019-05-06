package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Extract {

    public HashMap<String, String> readFile(String filename) {
        HashMap<String, String> person = new HashMap<String, String>();

      try {

          Scanner in = new Scanner(new File(filename));

          String line;

          while (in.hasNext()){
              line = in.nextLine();
              String[] keyvalue = line.split(":");
              person.put(keyvalue[0], keyvalue[1]);
          }
          in.close();
      }
      catch (Exception e)
      {
          System.out.println(e.getCause());
      }
return person;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Extract extract = new Extract();
        System.out.println(extract.readFile("D:\\adilkeymap.txt"));
        HashMap<String, String> adil = new HashMap<String, String>();
        adil = extract.readFile("D:\\adilkeymap.txt");

        System.out.println(adil.get("name"));
        System.out.println(adil.get("age"));
        System.out.println(adil.get("occupation"));
        System.out.println(adil.get("gender"));


    }

}
