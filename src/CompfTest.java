import java.util.Scanner;

public class CompfTest {

    public static void Notmain(String[] args) throws Exception {
        Compf c = new Compf();
        Scanner scan =new Scanner(System.in);
        while (true) {
            System.out.println("Введите формулу -> ");
            c.compile(scan.nextLine().toCharArray());
        }
    }

}
