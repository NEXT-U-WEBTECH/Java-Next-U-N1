public class Main {
   public static void main(String args[]) { 
      for(int i = 0; i<args.length; i++) {
         System.out.println("args[" + i + "]: " +  args[i]);
      }
   }
}

/*
 * 
Essayez d'exécuter ce programme comme indiqué ici:

$java CommandLine this is a command line 200 -100


Cela produira le résultat suivant :

Production

args[0]: this
args[1]: is
args[2]: a
args[3]: command
args[4]: line
args[5]: 200
args[6]: -100

 */