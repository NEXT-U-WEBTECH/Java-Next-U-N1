/*
 La description :
Cette méthode compare cette chaîne à l'objet 
spécifié. Le résultat est vrai si et seulement
si l'argument n'est pas nul et est un objet
String qui représente la même séquence 
de caractères que cet objet.

Syntaxe :
public boolean equals(Object anObject)
Paramètres :
anObject - l'objet auquel comparer cette chaîne.

Valeur de retour :
Cette méthode renvoie true si les String sont
 égaux, faux sinon.

 */

public class Main {
    public static void main(String args[]) {
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        boolean retVal;
  
        retVal = Str1.equals( Str2 );
        System.out.println("Returned Value = " + retVal );
  
        retVal = Str1.equals( Str3 );
        System.out.println("Returned Value = " + retVal );
     }
}
/*
 Cela produira le résultat suivant :

Production
Returned Value = true
Returned Value = true 
 
 */

