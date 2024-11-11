import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");

        Scanner sc = new Scanner(System.in);

        int lastArticleId = 0;

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
            else if ( command.equals("article write")) {
                int id = lastArticleId + 1;
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String body = sc.nextLine();

                lastArticleId = id;

                System.out.printf("%d번 글이 생성되었습니다.\n", id);
            }
            else {
                System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
            }

        }

        sc.close();
        System.out.println("== 프로그램 끝 ==");
    }
}