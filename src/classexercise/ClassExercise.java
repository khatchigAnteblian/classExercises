// More classes and objects
// Question 1:
//    A class method is a method that belongs to the class itself and we call it
//    from the class and not from any instance of the class.
//    An instance method is a method that belongs to each instance of the class
//    and can be called on the objects themselves.
//
// Question 2:
//    a) We refer to a class method by calling it using the class name: ClassName.method();
//    b) We refer to an instance method by calling it on the object: ObjectName.method();
//
// Question 4:
//    We declare a class field by using the keyword "static" and that field becomes
//    a part of the class itself and not just objects of the class.
//    We declare an instance field without the "static" keyword and they are only
//    used on instances of the class.
//
// Question 5:
//    We refer to a class field using the class name: ClassName.field;
//    We refer to an instance field using an instance of the class: ObjectName.field;


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
        Fraction d = new Fraction(24, 16);
        d = d.reduce();
        System.out.println(d.num + " / " + d.den);
        
        // New methods
        Fraction f = new Fraction(-4,5);
        System.out.println(f.num + " / " + f.den);
        System.out.println(Fraction.isPositive(f));
        Fraction k = Fraction.abs(f);
        System.out.println(k.num + " / " + k.den);
        System.out.println(Fraction.isPositive(k));
        Fraction t = Fraction.times(k, f);
        System.out.println(t.num + " / " + t.den);
        System.out.println(Fraction.isPositive(t));
    }
    
}
