import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        System.out.println("Задача 1, 2");
        int[] weight = {1, 2, 3};
        double[] x = {1.57, 7.654, 9.986};
        int[] y = new int[3];

        int i;
        for (i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        System.out.println();

        for (i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                System.out.print(x[i]);
                break;
            }
            System.out.print(x[i] + ", ");
        }

        System.out.println();
        for (i = 0; i < y.length; i++) {
            y[i] = i * 3;
            if (i == y.length - 1) {
                System.out.print(y[i]);
                break;
            }
            System.out.print(y[i] + ", ");

        }

        System.out.println();
        System.out.println("Задача 3");

        for (i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        System.out.println();

        for (i = x.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(x[i]);
                break;
            }
            System.out.print(x[i] + ", ");
        }

        System.out.println();
        System.out.println("Задача 4");

        i = 0;
        while (i <= weight.length - 1) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
            i++;
        }
        System.out.println(Arrays.toString(weight));

    }
}
