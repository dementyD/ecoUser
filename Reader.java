package greenUsers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Reader {

    public Human[] readFromFile(Path path) {
        long count = 0;
        try {
            count = Files.lines(path).count();
        } catch (IOException e) {
            System.out.println("файл не найден");
        }
        Human[] humans = new Human[(int) (count - 1)];
        try {
            Scanner sc = new Scanner(path);
            Human.setHeadings(sc.nextLine());
            int countHuman = 0;
            while (sc.hasNext()) {
                sc.useDelimiter("\\||\r\n");
                Human human = new Human(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(),
                        sc.nextInt(), sc.nextInt(), sc.nextInt());
                humans[countHuman++] = human;
            }
        } catch (IOException e) {
            System.out.println("файл не найден");
        }
        return humans;
    }
}
