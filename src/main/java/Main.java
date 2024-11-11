import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");

        Scanner sc = new Scanner(System.in);

        while ( true ) {
            System.out.printf("명령어) ");
            String command = sc.nextLine();
            command = command.trim();

            if ( command.length() == 0 ) {
                continue;
            }

            if ( command.equals("exit") ) {
                break;
            }
            else if ( command.equals("article list")) {
                System.out.println("게시글이 없습니다.");
            }
            else {
                System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
            }

        }

        sc.close();
        System.out.println("== 프로그램 끝 ==");
    }
}