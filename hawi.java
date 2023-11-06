import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hawi {
    private List<UserClass> boardList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "EUC-KR");
        hawi mainClass = new hawi();

        while(true) {
            System.out.println("1. 게시글 작성 2. 공지사항 작성 3. 게시글 출력");
            int choose = scanner.nextInt();
            scanner.nextLine();

            if (choose == 1 || choose == 2) {
                mainClass.createBoard(scanner, choose);
            } else if (choose == 3) {
                mainClass.printBoardList();

                System.out.println("몇번 글을 조회하시 겠습니까?");

                int index = scanner.nextInt();

                mainClass.boardList.get(index).printInfo();
            }
        }
    }

    public void createBoard(Scanner scanner, Integer choose) {
        System.out.println("제목을 입력해주세요.");
        String title = scanner.nextLine();
        System.out.println("내용을 입력해주세요.");
        String content = scanner.nextLine();
        System.out.println("사용자를 입력해주세요.");
        String user = scanner.nextLine();
        System.out.println("날짜를 입력해주세요.");
        String date = scanner.nextLine();

        if (choose == 1) {
            createPost(title, content, user, date);
        } else if (choose == 2) {
            System.out.println("중요도를 입력하세요");
            Integer importance = scanner.nextInt();
            scanner.nextLine();
            createNotice(title, content, user, date, importance);
        }
    }

    public void createPost(String title, String content, String user, String date) {
        Post post = new Post();

        post.setTitle(title);
        post.setContent(content);
        post.setUser(user);
        post.setDate(date);

        boardList.add(post);
    }

    public void createNotice(String title, String content, String user, String date, Integer importance) {
        Notice notice = new Notice();

        notice.setTitle(title);
        notice.setContent(content);
        notice.setUser(user);
        notice.setDate(date);
        notice.setImportance(importance);

        boardList.add(notice);
    }

    public void printBoardList() {
        for(int i = 0; i < boardList.size(); i++) {
            UserClass board = boardList.get(i);
            System.out.println(i + "." + board.getTitle() + " " + board.getUser());
        }
    }
}