
public class Rational  {
    private static Rational zero = new Rational(0, 1);

    private final long num;   // the numerator
    private final long den;   // the denominator

    // create and initialize a new Rational object
    public Rational(long numerator, long denominator) {

        // reduce fraction
        long g = gcd(numerator, denominator);
        long temp_num = numerator   / g;
        long temp_den = denominator / g;

        // move negative sign on denominator to the numerator
        if (temp_den < 0) { den = -temp_den; num = -temp_num; }
        else { den = temp_den; num = temp_num; }
    }

    // return the numerator of this Rational
    public long numerator() {
        return this.num;// replace code
    }

    // return the denominator of this Rational
    public long denominator() {
        return this.den;//replace code
    }

    // return the decimal representation of this Rational
    public double toDouble() {
        // cast the numerator to a double so that the division is floating-point division
        // instead of integer division (http://mathworld.wolfram.com/IntegerDivision.html)
        return ((double) num) / den;
    }

    // return string representation of this Rational
    // print as num/den, or if den is 1 then print just num
    // for example if num=8 and den=7 print 8/7
    // for example if num=9 and den=1 print 9
    public String toString() { 
        if (den == 1) {return num + "";}
        else {          return num + "/" + den /*fill in the blank*/;}
    }

    // return -1 if a<b or  0 if a=b or 1 if a>b 
    public long compareTo(Rational b) {
        Rational a = this;
        long lhs = a.num * b.den;
        long rhs = a.den * b.num;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }

    // return true if and only if this Rational is equal to o
    public boolean equals(Object o) {
        if (o == null) return false;        // this Rational cannot be null, so never equal to null
        if (!(o instanceof Rational)) return false; // a Rational is not equal to non-Rationals
        Rational r = (Rational) o;  // now we know o is a Rational, so can cast it to one
        return compareTo(r) == 0;
    }

    // create and return a new rational. The mediant of two rationals is
    // the sum of their numerators divided by the sum of their denominators.
    public static Rational mediant(Rational r, Rational s) {
        // rewrite this code
	    return null;
    }

    // Greatest Common Denominator
    private static long gcd(long m, long n) {
        // absolute values
        if (m < 0) m = -m;
        if (n < 0) n = -n;

        if (0 == n) return m;
        else return gcd(n, m % n);
    }

	// Least Common Multiple
    private static long lcm(long m, long n) {
        // absolute values
        if (m < 0) m = -m;
        if (n < 0) n = -n;

        return m * (n / gcd(m, n));    // parentheses important to avoid overflow
    }
    
    // return a * b,
    public Rational times(Rational b) {
        Rational a = this;

        // rewrite this code
        return null;
    }


    // return a + b
    public Rational plus(Rational b) {
        Rational a = this;

        long least_common_den = lcm(a.den, b.den);
        long new_a_num = (a.num*(least_common_den/a.den));
        long new_b_num = (b.num*(least_common_den/b.den));
        long sum_num = new_a_num + new_b_num;
        return new Rational(sum_num, least_common_den);






        // rewrite this code

        // steps show with an example
        // 1/3 + 1/6
        
        // Find least common multiple of denominators
        // 6

        // multiply numerators by least common multiple divided by denominator
        // (1*(6/3))= 2     (1*(6/6))= 1

        // 2/6 + 1/6

        // add numerators
        // 3/6

        //return null;
    }

    // return -a
    public Rational negate() {
        return new Rational(-num, den);
    }

    // return |a|
    public Rational abs() {
        // rewrite this code
        return null;
    }

    // return a - b
    public Rational minus(Rational b) {
        // rewrite this code
        return null;
    }


    // num/den ==> den/num
    public Rational reciprocal() {
        return null;
    }

    // return a / b
    public Rational divides(Rational b) {
        Rational a = this;
        return a.times(b.reciprocal());
    }


}
