/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oefening.java;

import java.util.Scanner;

/**
 *
 * @author 010771
 */
public class OefeningJAVA {
    private static int vermeningvuldiging;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
     /*   int uitkomst = somFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5+6 = ";
        
        printFunctie(begeleidendeTekst, uitkomst);

        
        int uitkomst2 = vermenigvuldigingsFunctie (3,4);
        String begeleidendeTekst2 = "de uitkomst van 3*4 = ";
        printFunctie2(begeleidendeTekst2,uitkomst2); */
        
         int getal;
         
         int i;
         i = input.nextInt();
//        faculteit(int getal) : int;
  //      if(getal = 1) return 1;
    //    return getal * faculteit(getal - 1);        
      // system.out.println(getal * faculteit(getal-1));
    
    
           System.out.println(faculteitFunctie(i)) ;   
    
    }

    
    public static int somFunctie(int getal1, int getal2){
        int optelling = getal1+getal2;
        
        return optelling;
    }
    
    
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }

  public static int vermenigvuldigingsFunctie (int getal3, int getal4){
      int vermenigvuldiging = getal3*getal4;
      return vermenigvuldiging;
 
      
    }
  public static int faculteitFunctie (int invoer){
      
      
      
      if (invoer == 1) {
          return 1;
      } 
      else { return invoer * faculteitFunctie(invoer-1);
      }

 
      
    }  
    public static void printFunctie2(String begeleidendetekst2,int getal){
        System.out.println(begeleidendetekst2+getal);
    }
     

}
