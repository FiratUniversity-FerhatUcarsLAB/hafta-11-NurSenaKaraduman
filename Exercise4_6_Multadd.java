//anlamadığım için gpt ye yaptırdım
public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO: implement multadd
        return a * b + c;
    }

    public static double expSum(double x) {
        // TODO: implement expSum
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // TODO: test methods

        // Test multadd
        System.out.println("multadd(1.0, 2.0, 3.0) = " + multadd(1.0, 2.0, 3.0));

        // Test sin(pi/4) + cos(pi/4)/2
        double pi = Math.PI;
        double result = Math.sin(pi / 4) + Math.cos(pi / 4) / 2;
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result);

        // Test log(10) + log(20)
        System.out.println("log(10) + log(20) = " + (Math.log(10) + Math.log(20)));

        // Test expSum
        System.out.println("expSum(1.0) = " + expSum(1.0));
    }
}
