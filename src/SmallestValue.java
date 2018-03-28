import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("Size should not exceed 50");
            }
        } while (size > 50);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Number Of Things " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("List Of Numbers");
        for (int j = 0; j <array.length; j++) {
            System.out.print(array[j] + "\t" );
        }

        int min = array[0];
        int idex = 1;
        for (int j =0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                idex = j +1;
            }
        } System.out.println("min " + min + "\t" + "order " + idex);
    }
}

