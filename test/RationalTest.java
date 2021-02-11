public class RationalTest {
    public static void main(String[] args) {
        Rational x, y, z;

        // 1/2 + 1/3 = 5/6
        x = new Rational(1, 2);
        y = new Rational(1, 3);
        z = x.plus(y);
        System.out.println(z);

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.plus(y);
        System.out.println(z);

        // 1/200000 + 1/300000 = 1/120000
        x = new Rational(1, 200000);
        y = new Rational(1, 300000);
        z = x.plus(y);
        System.out.println(z);

        // 50001/20 + 60001/30 = 54001/12
        x = new Rational(50001, 20);
        y = new Rational(60001, 30);
        z = x.plus(y);
        System.out.println(z);

        //  4/17 * 17/4 = 1
        x = new Rational(4, 17);
        y = new Rational(17, 4);
        z = x.times(y);
        System.out.println(z);

        // 30371/32470 * 30375/32465 = 36900765/42165542
        x = new Rational(30371, 32470);
        y = new Rational(30375, 32465);
        z = x.times(y);
        System.out.println(z);

        // 1/6 - -4/-8 = -1/3
        x = new Rational( 1,  6);
        y = new Rational(-4, -8);
        z = x.minus(y);
        System.out.println(z);
    }
}
