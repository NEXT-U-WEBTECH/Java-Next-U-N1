public class Main {

    public static void main(String args[]) {
       
        String fs;
        Int intVar = 5;
        Float floatVar = 2.0;
        String stringVar = "Bonjour";



        fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", floatVar, intVar, stringVar);
       System.out.println(fs);

       System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s", floatVar, intVar, stringVar);
    }
 }
 

