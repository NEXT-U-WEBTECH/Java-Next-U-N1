/*
 La description : 
Cette méthode a deux variantes et divise cette
 chaîne autour des correspondances de l'expression
  régulière donnée.

Syntaxe :
public String[] split(String regex)

Paramètres :
regex − l'expression régulière de délimitation.

Valeur de retour:
Il renvoie le tableau de chaînes calculé en divisant cette chaîne autour des correspondances de l'expression régulière donnée.
 */

public class Main {
    public static void main(String args[]) {
        String Str = new String("Welcome-to-Java");
        System.out.println("Return Value :" );      
        
        for (String retval: Str.split("-")) {
           System.out.println(retval);
        }
     }
}

/*
 * Cela produira le résultat suivant -

Production
Return Value :
Welcome
to
Java
 */
