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
<<<<<<< HEAD
        
        // Question 1
        
        int[][] p = {{1, 3}, {7, -5}, {5, 6}, {-9, -12}, {5, 8}};
        int[][] q = {{4, 5}, {-9, -7}, {-25, -30}, {-3, 4}, {13, 20}};
        
        for (int i=0; i<p.length; i++) {
            Fraction pFrac = new Fraction(p[i][0], p[i][1]);
            Fraction qFrac = new Fraction(q[i][0], q[i][1]);
            Fraction r = pFrac.larger(qFrac);

            System.out.println(r.num + " / " + r.den);
        }
        
        
        // Question 2
        Fraction a = new Fraction(5,6);
        Fraction b = new Fraction(3,8);
        Fraction c = a.timesEquals(b);
        System.out.println(a.num + " / " + a.den);
        System.out.println(b.num + " / " + b.den);
        System.out.println(c.num + " / " + c.den);
        c = c.reduce();
        System.out.println(c.num + " / " + c.den);
        
        
        // Question 3
        Fraction x = new Fraction(1.5);
        System.out.println(x.num + " / " + x.den);
        x = x.reduce();
        System.out.println(x.num + " / " + x.den);
        
        // Addition
        Fraction y = new Fraction(1,2);
        Fraction z = new Fraction(2,3);
        Fraction j = y.plus(z);
        System.out.println(j.num + " / " + j.den);
=======
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
>>>>>>> 3b510d8dbc59c2379d8897fe79d035d1ef51b30f
    }
    
}
