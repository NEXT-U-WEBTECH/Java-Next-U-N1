/*
La description :
La méthode valueOf renvoie l'objet Number approprié contenant la valeur de l'argument passé.
 L'argument peut être un type de données primitif, String, etc.

Cette méthode est une méthode statique. La méthode peut prendre deux arguments, 

l'un étant une chaîne et l'autre une base.


Syntaxe :
Voici toutes les variantes de cette méthode -

static Integer valueOf(int i)
static Integer valueOf(String s)
static Integer valueOf(String s, int radix)

Paramètres :
Voici le détail des paramètres:

i - Un int pour lequel la représentation Integer serait renvoyée.

s - Une chaîne pour laquelle la représentation entière serait renvoyée.

radix - Ceci serait utilisé pour décider de la valeur de l'entier renvoyé en fonction de la chaîne transmise.
 * 
 */

public class Main {

    public static void main(String args[]) {

        Integer x =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");             
    
  
        System.out.println(x); 
        System.out.println(c);
        System.out.println(a);
        
    }
 }
 
 /*
 
 Output
 
9
5.0
80.0
 
 */
