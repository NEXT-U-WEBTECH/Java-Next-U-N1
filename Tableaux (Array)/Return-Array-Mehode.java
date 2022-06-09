
public class Main {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
     
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
           result[j] = list[i];
        }
        return result;
     }

     public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }
       }
  
      public static void main(String args[]) {
        int[] myList = {3, 1, 2, 6, 4, 2};
        int[] result = new int[myList.length];
        result = reverse(myList);
        printArray(result);
       
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
