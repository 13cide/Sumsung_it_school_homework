public class Fraction { // обыкновенная дробь
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }

    Fraction(double num) {
        while (num % 1 != 0) {
            num*=10;
            denominator*=10;
        }
        numerator = (int) num;
        normalize();
        System.out.println("4: I am constructor with numerator " + numerator + " denominator " + denominator);
    }

    Fraction(String frac) {
        boolean fault = false;
        int i = 0;
        for(; i < frac.length(); ++i) {
            if (!((frac.charAt(i) >= '0' && frac.charAt(i) <= '9') || frac.charAt(i) == '/')) {
                System.out.println("Incorrect input");
                fault = true;
                break;
            }
            else if (frac.charAt(i) == '/')
                break;
            else {
                numerator *= 10;
                numerator += frac.charAt(i) - 48;
            }
        }
        if (!fault) {
            denominator = 0;
            for (++i; i < frac.length(); ++i) {
                if (frac.charAt(i) >= '0' && frac.charAt(i) <= '9') {
                    denominator *= 10;
                    denominator += frac.charAt(i) - 48;
                } else {
                    System.out.println("Incorrect input");
                    break;
                }
            }
            if (denominator == 0) ++denominator;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }

    void mult(Fraction f) {
        numerator *= f.numerator;
        denominator *= f.denominator;
        normalize();
    }

    void sum(Fraction f) {
        numerator = numerator * f.denominator + f.numerator * denominator;
        denominator *= f.denominator;
        normalize();
    }
}
