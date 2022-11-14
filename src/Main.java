import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method4();

    }
    public static void method4() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Write first salary :");
        int salary1 = scanner.nextInt();
        array[0] = salary1;
        if (salary1 == 0) {
            System.out.println("mynday zarplata jok");
        }
        System.out.print("Write second salary :");
        int salary2 = scanner.nextInt();
        array[1] = salary2;
        if (salary2 == 0) {
            System.out.println("mynday zarplata jok");
        }
        System.out.print("Write 3 salary :");
        int salary3 = scanner.nextInt();
        array[2] = salary3;
        if (salary2 == 0) {
            System.out.println("mynday zarplata jok");
        }
        int max = array[0];
        int min = array[0];
        for (int j : array) {

            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        System.out.println("En chon aylik :" + max);
        System.out.println("En kichine aylik :" + min);
        System.out.println(max - min);



    }