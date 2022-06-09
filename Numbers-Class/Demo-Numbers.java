/*
 * Lorsque x reçoit une valeur entière, le compilateur place l'entier dans une case
 * 
 *  car x est un objet entier. Plus tard, x est déboîté afin qu'ils puissent être
 * 
 *  ajoutés sous forme d'entier.
 * 
 */

public class Main {

    public static void main(String args[]) {

        /********** Wrapper Float ************** */
       
        float b = 55.05F;
        String bb = "45";
 
        // Construct two Float objects
        Float x = Float.valueOf(b);
        Float y = Float.parseFloat(bb);
 
        // toString()
        System.out.println("toString(b)-float = " + Float.toString(b));

        /********** Wrapper Double ************** */

        double bd = 55.05;
        String cc = "45";
 
        // Construct two Float objects
        Double xd = Double.valueOf(b);
        Double yd = Double.parseDouble(bb);
 
        // toString()
        System.out.println("toString(bd)-double = " + Double.toString(bd));

        /***********************Wrapper Integer ******************************** */

        int bi = 55;
        String bbi = "45";
 
        // Construct two Integer objects    

        Integer xi = Integer.valueOf(bi);
        Integer yi = Integer.parseDouble(bbi);
 
        // toString()
        System.out.println("toString(bi)-int = " + Integer.toString(bi));
    }
 }
 
 /*
 
 Output
 
toString(b)-float = 55.5
toString(bd)-double = 55.5
 
 */
