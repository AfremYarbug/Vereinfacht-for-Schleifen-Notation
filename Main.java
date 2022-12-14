package main;
public class Main {

    public static void main(String[] args) {
        
      // for (<<TYP>> <<VARIABLENNAME>> : <<AUSDRUCK>>)
      
      //Traditionelle Schleifen-Notation
      int summe = 0;
      for (int i = 0; i < werte.length; i++) {
        summe = summe + werte[i];
      }
      
      // Neue, vereinfachte Schleifen-Notation
      int summe = 0;
      for (int x : werte) {
        summe = summe + x;
      }
      
      /*ist sorgfältig mit Indexgrenzen und Komponentenzugriffen, da man Laufzeitfehler bei der Überschreitung der Indexbereiche macht...*/
      
    }
    
}
/*Beispiel
int[] array = {6, 4};
        int[] array1 = {7, 8};
        for (int x : array) {
            for (int y : array1) {
                
                System.out.print(x + " ");
                System.out.print(y + " ");
            }

        }*/
