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
//        int[][] p = {{1, 3}, {7, -5}, {5, 6}, {-9, -12}, {5, 8}};
//        int[][] q = {{4, 5}, {-9, -7}, {-25, -30}, {-3, 4}, {13, 20}};
//        
//        for (int i=0; i<p.length; i++) {
//            Fraction pFrac = new Fraction(p[i][0], p[i][1]);
//            Fraction qFrac = new Fraction(q[i][0], q[i][1]);
//            Fraction r = pFrac.larger(qFrac);
//
//            System.out.println(r.num + " / " + r.den);
//        }
        
//        Fraction a = new Fraction(12, 4);
//        Fraction b = new Fraction(3, 4);
//        Fraction c = a.timesEquals(b);
//        System.out.println(c.num + " / " + c.den);
//        System.out.println(a.num + " / " + a.den);
//        a = a.reduce();
//        System.out.println(a.num + " / " + a.den);
        Fraction c = new Fraction(24, 16);
        c = c.reduce();
        System.out.println(c.num + " / " + c.den);
        
//        double a = 8.349;
//        Fraction test = new Fraction(a);
//        System.out.println(test.num + " / " + test.den);
    }
    
}
