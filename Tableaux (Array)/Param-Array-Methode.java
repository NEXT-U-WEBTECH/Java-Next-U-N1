
public class Main {

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
       System.out.print(array[i] + " ");
    }
   }

    public static void main(String args[]) {
      int[] myList = {3, 1, 2, 6, 4, 2};
      printArray(myList);
     
    }
 }

 /*
  * 
Cela produira le résultat suivant :

Production
3
1
2
6
4
2
*/
