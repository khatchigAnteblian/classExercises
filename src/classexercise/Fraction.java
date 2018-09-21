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
public class Fraction {
    int num;
    int den;
    
    public Fraction(int a, int b) {
        num = a;
        den = b;
    }
    
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
    
    public Fraction reduce() {
        if (this.num == this.den) {
            return new Fraction(1, 1);
        }
        if (this.num % this.den == 0) {
            return new Fraction(this.num / this.den, 1);
        }
//        int min = this.num >
//        int minRoot = (int) Math.sqrt(this.num);
        return this;
    }
}
