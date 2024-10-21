/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csolti.firstcsolti;


public class Firstcsolti {

    public static void main(String[] args) {
    
    System.out.println("eredeti: ");    
        
    int [] eredeti = {0,1,2,3};
    kiirTomb(eredeti);
    valtoztat(eredeti);
    System.out.println("változatás után: ");
    kiirTomb(eredeti);   
    }
    
    private static void kiirTomb(int [] Tomb){
        for (int szam : Tomb){
            System.out.println(szam + " ");
        }
        System.out.println("");
    }

    private static void valtoztat(int[] Tomb) {
        Tomb[0]=100;
    }
    
    
    
}
