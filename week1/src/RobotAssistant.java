import java.util.*;
public class RobotAssistant {
    public static void main(String[] args) {
        int a, b;
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a:");
        a = sc.nextInt();
        System.out.println("Enter a value for b:");
        b = sc.nextInt();
        System.out.println("1.add" + "\n" + "2.subtract" + "\n" + "3.multiple" + "\n" + "4.division");
        System.out.println("choose any one operator");
        ch = sc.nextInt();

        switch (ch) {
            case 1: {
                System.out.println(a + b);
                break;
            }
            case 2: {
                System.out.println(a - b);
                break;
            }
            case 3: {
                System.out.println(a * b);
                break;
            }
            case 4: {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("choose the valid operator");
            }
        }
    }
}