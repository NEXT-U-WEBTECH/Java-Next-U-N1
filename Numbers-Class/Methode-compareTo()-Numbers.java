/*
La description : 
La méthode compare l'objet Number qui a appelé la méthode à l'argument. 
Il est possible de comparer Byte, Long, Integer, etc.

Cependant, deux types différents ne peuvent pas être comparés, l'argument 

et l'objet Number invoquant la méthode doivent être du même type.


Syntaxe :
public int compareTo( NumberSubClass referenceName )
Paramètres
Voici le détail des paramètres :

referenceName - Il peut s'agir d'un octet, d'un double, d'un entier, d'un flottant, d'un long ou d'un court.


Valeur de retour :
Si l'entier est supérieur à l'argument, 1 est renvoyé.
Si l'entier est égal à l'argument, 0 est renvoyé.
Si l'entier est inférieur à l'argument, alors -1 est renvoyé.
 * 
 */

public class Main {

    public static void main(String args[]) {

        Integer x = 5;
        //Integer value is greater than the argument (5>3) so, output is 1
        System.out.println(x.compareTo(3));
        //Integer value is equal to the argument so, output is 0
        System.out.println(x.compareTo(5));
        //Integer value is less than the argument (5<8) so, output is −1
        System.out.println(x.compareTo(8));  
    }
 }
 
 /*
 
 Output
 
1
0
-1
 
 */
