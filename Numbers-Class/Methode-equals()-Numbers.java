/*
La description
La méthode détermine si l'objet Number qui appelle la méthode est égal à l'objet passé en argument.

Syntaxe :
public boolean equals(Object o)

Paramètres:
Voici le détail des paramètres :
N'importe quel objet.

Valeur de retour :
La méthode renvoie True si l'argument n'est pas nul et est un objet du même type et avec la même valeur
numérique. Certaines exigences supplémentaires pour les objets Double et Float sont décrites
dans la documentation de l'API Java.
 * 
 */

public class Main {

    public static void main(String args[]) {

        Integer x = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;
  
        System.out.println(x.equals(y));  
        System.out.println(x.equals(z)); 
        System.out.println(x.equals(a));
    }
 }
 
 /*
 
 Output
 
false
true
false
 
 */
