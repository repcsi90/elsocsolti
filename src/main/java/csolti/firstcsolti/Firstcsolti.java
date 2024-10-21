/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csolti.firstcsolti;


public class Firstcsolti {

    public static void main(String[] args) {
    
    System.out.println("eredeti: ");    
        
    int [] eredeti = {0,1,2,3};
    String szoveg = "ez az eredeti";
    int szam = 7;
    kiiro(eredeti, szoveg, szam);
    valtoztato(eredeti, szoveg, szam);
    System.out.println("változatás után: ");
    kiiro(eredeti,szoveg, szam);   
    }
    
    private static void kiiro(int [] Tomb, String s, int i){
        for (int szam : Tomb){
            System.out.print(szam + " ");
        }
        System.out.print("s:"+ s + "i" + i);
    }

    private static void valtoztato(int[] Tomb, String s,int i) {
        Tomb[0]=100;
        s = "---";
        i = 100;
    }
    
    
    
}
