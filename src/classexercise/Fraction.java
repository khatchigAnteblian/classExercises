package classexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 345983704
 */
public class Fraction {
    int num;
    int den;
    
    public Fraction(int a, int b) {
        num = a;
        den = b;
    }
    
    public Fraction(double a) {
        // Turn double into fraction based on x * 10^y
        int decimals = decimalPlaces(a);
        num = (int) (a * Math.pow(10, decimals));
        den = (int) Math.pow(10, decimals);
    }
    
    private int decimalPlaces(double num) {
        if (num < 10) {
            double decimals;
            // Transform a decimal number *.x into 10.x
            // By adding (10 - num) to num
            // Mod it by ten and get 0.x
            decimals = ((10 - (int) num) + num) % 10;
            // Then get the length of x
            return String.format("%.3f", decimals).length();
        } 
        // If num is greater than 10
        // Mod by 10 and pass it back into the method
        return (decimalPlaces(num % 10));
    }
    
    private List commonFactors() {
        // Get the larger one between num and den
        int max = this.num < this.den ? this.den : this.num;
        // Get the root of max
        int maxRoot = (int) Math.sqrt(this.num);
        // Create list to store factors
        List<Integer> factors = new ArrayList<>();
        
        // Loop from root of max to 2 (including 2)
        for (int i=maxRoot; i>1; i--) {
            // If both num and den are divisible by i
            // Add i to factors list
            // Also add (num / i) because we're only looping
            // from the root to 2
            if (this.num % i == 0 && this.den % i == 0) {
                factors.add(i);
                if (Math.sqrt(this.num) != i) {
                    factors.add(this.num / i);
                }
                if (Math.sqrt(this.den) != i) {
                    factors.add(this.den / i);
                }
            }
        }
        // Sort factors from smallest to greatest
        Collections.sort(factors);
        
        return factors;
    }
    
    public static boolean isPositive(Fraction fraction) {
        // If both numerator and denominator are greater than 0
        // Return true
        if (fraction.num >= 0 && fraction.den > 0) {
            return true;
        }
        return false;
    }
    
    public static Fraction abs(Fraction fraction) {
        // Instantiate a new instance with abs values of num and den
        int newNum = Math.abs(fraction.num);
        int newDen = Math.abs(fraction.den);
        
        return new Fraction(newNum, newDen);
    }
    
    public static Fraction times(Fraction one, Fraction two) {
        // Instantiate a new instance with products of nums and dens
        int newNum = one.num * two.num;
        int newDen = one.den * two.den;
        
        return new Fraction(newNum, newDen);
    }
    
    public double size() {
        // Return numeric value of fraction
        return (double)this.num / (double)this.den;
    }
    
    public Fraction larger(Fraction other) {
        // Compare numeric values and return larger one
        if (this.size() >= other.size()) {
            return this;
        }
        return other;
    }
    
    public Fraction timesEquals(Fraction other) {
        // Instantiate a new instance with products of nums and dens
        int newNum = this.num * other.num;
        int newDen = this.den * other.den;
        
        return new Fraction(newNum, newDen);
    }
    
    public Fraction plus(Fraction other) {
        // Get common denominator by multiplying dens
        int commonDen = this.den * other.den;
        // Multiply numerators accordingly and add them
        int newNum = (this.num * other.den) + (other.num * this.den);
        
        return new Fraction(newNum, commonDen);
    }
    
    public Fraction reduce() {
        // If num and den are the same, return 1/1
        if (this.num == this.den) {
            return new Fraction(1, 1);
        }
        // If num is divisible by den, return (num/den)/1
        if (this.num % this.den == 0) {
            return new Fraction(this.num / this.den, 1);
        }
        // Get list of factors
        List<Integer> factors = commonFactors();
        // Loop through factors from greatest to smallest
        for (int i=factors.size() - 1; i>=0; i--) {
            int n = factors.get(i);
            // if both num and den are divisible by i
            // return new fraction
            if (this.num % n == 0 && this.den % n == 0) {
                return new Fraction(this.num / n, this.den / n);
            }
        }
        
        // Return same fraction if no common factors
        return this;
    }
}
