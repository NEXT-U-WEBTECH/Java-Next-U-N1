/*
 La description : 
La méthode détermine si la valeur char spécifiée est en minuscules.

Syntax
boolean isLowerCase(char ch)

Paramètres :
ch − Type de caractère primitif..

Valeur de retour:
Cette méthode renvoie vrai, si le caractère passé est vraiment une majuscule.
 */

public class Main {
    public static void main(String args[]) {
      System.out.println(Character.isLowerCase('c'));
      System.out.println(Character.isLowerCase('C'));
      System.out.println(Character.isLowerCase('\n'));
      System.out.println(Character.isLowerCase('\t'));
     }
}

/*
 * Cela produira le résultat suivant -

Production
true
false
false
false
 */
