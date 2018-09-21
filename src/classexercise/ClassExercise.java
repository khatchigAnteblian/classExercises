/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercise;

/**
 *
 * @author 345983704
 */

public class ClassExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] pNums = {1, 7, 5, -9, 5};
//        int[] pDens = {3, -5, 6, -12, 8};
//        int[] qNums = {4, -9, -25, -3, 13};
//        int[] qDens = {5, -7, -30, 4, 20};
//        
//        for (int i=0; i<pNums.length; i++) {
//            Fraction p = new Fraction(pNums[i], pDens[i]);
//            Fraction q = new Fraction(qNums[i], qDens[i]);
//            Fraction r = p.larger(q);
//
//            System.out.println(r.num + " / " + r.den);
//        }
        
        Fraction a = new Fraction(12, 4);
        Fraction b = new Fraction(3, 4);
        Fraction c = a.timesEquals(b);
        System.out.println(c.num + " / " + c.den);
        System.out.println(a.num + " / " + a.den);
        a = a.reduce();
        System.out.println(a.num + " / " + a.den);
        
    }
    
}
