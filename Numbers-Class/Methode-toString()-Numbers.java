/*
La description :
La méthode est utilisée pour obtenir un objet String représentant la valeur de l'objet Number.

Si la méthode prend un type de données primitif comme argument, l'objet String représentant la valeur 

du type de données primitif est renvoyé.

Si la méthode prend deux arguments, une représentation String du premier argument dans la base

spécifiée par le second argument sera renvoyée.

Syntaxe :
Voici toutes les variantes de cette méthode -

String toString()
static String toString(int i)
Paramètres :
Voici le détail des paramètres −

i - Un int pour lequel la représentation sous forme de chaîne serait renvoyée.

Valeur de retour :
toString() - Ceci renvoie un objet String représentant la valeur de cet Integer.

toString(int i) - Cela renvoie un objet String représentant l'entier spécifié.
 * 
 */

public class Main {

    public static void main(String args[]) {

        Integer x = 5;

        System.out.println(x.toString());  
        System.out.println(Integer.toString(12)); 
    }
 }
 
 /*
 
 Output
 
5
12
 
 */
