public class Main {

    public static void main(String[] args) {
       methodRankPoints(255.7);
    }
 
    public static void methodRankPoints(double points) {
       if (points >= 202.5) {
          System.out.println("Rank:A1");
       }else if (points >= 122.4) {
          System.out.println("Rank:A2");
       }else {
          System.out.println("Rank:A3");
       }
    }
 }


 /*
  * 

public class Main {

    public static void main(String[] args) {
       string retourStringMethode = methodRankPoints(255.7);

       System.out.println(retourStringMethode);
    }
 
    public static string methodRankPoints(double points) {
        string retourMethodeLocal = "";
       if (points >= 202.5) {         
          retourMethodeLocal = "Rank:A1";
       }else if (points >= 122.4) {
          retourMethodeLocal = "Rank:A2";
       }else {
          retourMethodeLocal = "Rank:A3";
       }
       return retourMethodeLocal;
    }
 }

  */