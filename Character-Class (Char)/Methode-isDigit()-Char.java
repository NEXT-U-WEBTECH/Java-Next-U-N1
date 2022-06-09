/*
 La description : 
La méthode détermine si la valeur char spécifiée est un chiffre.

Syntax
boolean isDigit(char ch)

Paramètres :
ch − Type de caractère primitif.

Valeur de retour:
Cette méthode renvoie vrai, si le caractère passé est vraiment un chiffre.
 */

public class Main {
    public static void main(String args[]) {
      System.out.println(Character.isDigit('c'));
      System.out.println(Character.isDigit('5'));
     }
}

/*
 * Cela produira le résultat suivant -

Production
false
true
 */
