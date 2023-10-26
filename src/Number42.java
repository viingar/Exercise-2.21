import java.util.Scanner;
public class Number42 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String str = scanner.nextLine();

            str = str.replaceAll("кака", "вырезано цензурой ");
            str = str.replaceAll("бяка", "вырезано цензурой ");


            System.out.println("Результат замены: " + str);

    }

}
