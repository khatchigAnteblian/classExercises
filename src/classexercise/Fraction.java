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
        int decimals = decimalPlaces(a);
        num = (int) (a * Math.pow(10, decimals));
        den = (int) Math.pow(10, decimals);
    }
    
    private int decimalPlaces(double num) {
        if (num < 10) {
            double decimals;
            decimals = ((10 - (int) num) + num) % 10;
            return String.format("%.3f", decimals).length();
        } 
        return (decimalPlaces(num % 10));
    }
    
<<<<<<< HEAD
    private List commonFactors() {
        int max = this.num < this.den ? this.den : this.num;
        int maxRoot = (int) Math.sqrt(this.num);
        List<Integer> factors = new ArrayList<>();
        
        for (int i=maxRoot + 1; i>1; i--) {
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
        Collections.sort(factors);
        
        return factors;
    }
    
=======
>>>>>>> 3b510d8dbc59c2379d8897fe79d035d1ef51b30f
    public double size() {
        return (double)this.num / (double)this.den;
    }
    
    public Fraction larger(Fraction other) {
        if (this.size() >= other.size()) {
            return this;
        }
        return other;
    }
    
    public Fraction timesEquals(Fraction other) {
        int newNum = this.num * other.num;
        int newDen = this.den * other.den;
        
        return new Fraction(newNum, newDen);
    }
    
    public Fraction plus(Fraction other) {
        int commonDen = this.den * other.den;
        int newNum = (this.num * other.den) + (other.num * this.den);
        
        return new Fraction(newNum, commonDen);
    }
    
    private List commonFactors() {
        int max = this.num < this.den ? this.den : this.num;
        int maxRoot = (int) Math.sqrt(this.num);
        List<Integer> factors = new ArrayList<>();
        
        for (int i=maxRoot + 1; i>1; i--) {
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
        Collections.sort(factors);
        
        return factors;
    }
    
    public Fraction reduce() {
        if (this.num == this.den) {
            return new Fraction(1, 1);
        }
        if (this.num % this.den == 0) {
            return new Fraction(this.num / this.den, 1);
        }
        
        List<Integer> factors = commonFactors();
        
        for (int i=factors.size() - 1; i>=0; i--) {
            int n = factors.get(i);
            if (this.num % n == 0 && this.den % n == 0) {
                return new Fraction(this.num / n, this.den / n);
            }
        }
        return this;
    }
}
