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
       
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);
    }
 }
 
 /*
 
 Output
 
15.
 
 */
