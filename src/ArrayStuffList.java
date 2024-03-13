import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStuffList {

    public void printnames(){
        String[] namesArray = new String[3];
        namesArray[0] = "Larry";
//namesArray[1] = "Curly";
        namesArray[2] = "Moe";

        System.out.println("The size of the array is " + namesArray.length);

//ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Larry");
        names.add("Curly");
        names.add("Moe");

        System.out.println("The size of the ArrayList is " + names.size());

        System.out.println("The element at index 1 is " + names.get(1));

        names.remove(1);

        System.out.println("The element at index 1 is " + names.get(1));

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        for (String eachName : names){
            System.out.println(eachName);
        }
    }

    public void printnamesTesting(){
        ArrayList<String> names = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        String StringNext = "";

        while (!StringNext.equals("Next")) {
            System.out.println("Please Input names, when you are done, enter 'Next': ");
            StringNext = myScanner.next();
            if (!StringNext.equals("Next")) {
                names.add(StringNext);
            }
        }

        System.out.println("\n" + "Your List of names are: ");
        for (String eachName : names){
            System.out.println(eachName);
        }
        System.out.println("And the Amount of names you inputted is: " + names.size());
    }
}
