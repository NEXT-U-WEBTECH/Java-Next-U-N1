/*
 La description : 
Cette méthode détermine si la valeur char spécifiée est en majuscule.

Syntax
boolean isUpperCase(char ch)

Paramètres :
ch − Type de caractère primitif.

Valeur de retour:
Cette méthode renvoie vrai, si le caractère passé est vraiment une majuscule.
 */

public class Main {
    public static void main(String args[]) {
      System.out.println(Character.isUpperCase('c'));
      System.out.println(Character.isUpperCase('C'));
      System.out.println(Character.isUpperCase('\n'));
      System.out.println(Character.isUpperCase('\t'));
     }
}

/*
 * Cela produira le résultat suivant -

Production
false
true
false
false
 */
