/*
La description :
Cette méthode renvoie l'index dans cette chaîne 
de la première occurrence de la sous-chaîne
spécifiée. S'il ne s'agit pas d'une sous-chaîne, -1 est renvoyé.

Syntaxe :
int indexOf(String str)

Paramètres:
str − une chaîne.

Valeur de retour: 
entier
 */


public class Main {

    public static void main(String args[]) {
        String Str = new String("Welcome to Tutorialspoint.com");
        String SubStr1 = new String("Tutorials");
        System.out.println("Found Index :" + Str.indexOf( SubStr1 ));
     }
}

/*
 * Cela produira le résultat suivant -

Production
Found Index :11
 */
