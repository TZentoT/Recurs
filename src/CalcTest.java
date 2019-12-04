import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        while (true){
            Calc c = new Calc();
            System.out.print(("Введите формулу -> "));
            c.compile(scan.nextLine().toCharArray());
        }

    }

}
