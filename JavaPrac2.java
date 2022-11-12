import java.util.Scanner;

public class JavaPrac2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[필수 정보 입력]");
        System.out.println("1. 이름 :");
        String strNum1 = scanner.nextLine();

        System.out.println("2. 주민번호 앞 6자리 :");
        String strNum2 = scanner.nextLine();

        System.out.println("3. 전화번호 :");
        String strNum3 = scanner.nextLine();
        System.out.println();

        System.out.println("[입력된 내용]");
        System.out.println("1. 이름 :" + strNum1);
        System.out.println("2. 주민번호 앞 6자리 : " + strNum2);
        System.out.println("3. 전화번호 : " + strNum3);

    }
}

