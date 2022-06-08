/*
La description : 
Cette méthode a deux variantes et renvoie une 
nouvelle chaîne qui est une sous-chaîne 
de cette chaîne. La sous-chaîne commence par
 le caractère à l'index spécifié et s'étend 
 jusqu'à la fin de cette chaîne ou jusqu'à 
 endIndex – 1, si le deuxième argument est donné.

Syntaxe
Voici la syntaxe de cette méthode -

public String substring(int beginIndex, int endIndex)

Paramètres:
beginIndex - l'index de début, inclus.

endIndex − l'index de fin, exclusif.

Valeur de retour:
La sous-chaîne spécifiée.
 */

public class Main {

    public static void main(String args[]) {
        String Str = new String("Welcome to TutorialsJava");
  
        System.out.print("Return Value :" );
        System.out.println(Str.substring(10, 15) );
     }
    
}
/*
 * Cela produira le résultat suivant -

Production
Return Value : Tuto
 */