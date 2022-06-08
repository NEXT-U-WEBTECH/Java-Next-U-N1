/*
 * 
La description :
Cette méthode compare lexicographiquement deux chaînes.

Syntaxe :
Voici la syntaxe de cette méthode :

    int compareTo(String anotherString)

Paramètres:
anotherString - la chaîne à comparer.

Valeur de retour:
La valeur 0 si l'argument est une chaîne lexicographiquement 
égale à cette chaîne , une valeur inférieure à 0 si l'argument
 est une chaîne lexicographiquement supérieure à cette chaîne ,
  et une valeur supérieure à 0 si l'argument est une chaîne 
  lexicographiquement inférieure à cette chaîne.
 */

public class Main {

    public static void main(String args[]) {
       String str1 = "Strings are immutable";
       String str2 = "Strings are immutable";
       String str3 = "Integers are not immutable";
       
       int result = str1.compareTo( str2 );
       System.out.println(result);
       
       result = str2.compareTo( str3 );
       System.out.println(result);
       
       result = str3.compareTo( str1 );
       System.out.println(result);
    }
 }

 /*
  * 
  Cela produira le résultat suivant :

Production
0
10
-10
  */
