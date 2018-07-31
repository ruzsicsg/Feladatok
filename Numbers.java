import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(new File("numbers.txt")));
        while (sc.hasNextInt())
        {
            int number=sc.nextInt();
            System.out.println(number +" "+ (isEven(number)?"páros":"páratlan"));
        }
    }

    public static Boolean isEven(int n) {
        return n % 2 == 0;
    }
}
