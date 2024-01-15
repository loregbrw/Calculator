public class Calculator {

    public static double[] quadratic(double a, double b, double c) throws ZeroAException, NegativeResultException{
        if (a == 0) {
            throw new ZeroAException();
        }

        double delta = (double)((b * b) - (4 * a * c));
        
        if (delta < 0) {
            throw new NegativeResultException();
        }
        
        double x1, x2;
        x1 = (double)((-b + delta) / 2 * a);
        x2 = (double)((-b - delta) / 2 * a);
        
        return new double[] {x1, x2};
    }

    public static double linear(double a, double b) throws ZeroAException {
        double x;

        if (a == 0) {
            throw new ZeroAException();
        }

        x = -b / a;

        return x;
    }

    public static double[] linearTwo(double a1, double b1, double c1, double a2, double b2, double c2) throws ZeroAException {
        if (a1 == 0 && a2 == 0) {
            throw new ZeroAException();
        } else if (b1 == 0 && b2 == 0) {
            throw new ZeroAException();
        }
        double x, y;

        y = ((a1 * c2) - (a2 * c1)) / ((a1 * b2) - (a2 * b1));

        x = (c1 - (b1 * y)) / a1;

        return new double[] {x, y};
    }
}