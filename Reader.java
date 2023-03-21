package greenUsers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Reader {

    public Human[] readFromFile(Path path) {
        long countLines = 0;
        int countHuman = 0;
        Scanner sc = null;
        try {
            countLines = Files.lines(path).count();
            sc = new Scanner(path);
        } catch (IOException e) {
            System.out.println("файл не найден");
        }
        Human.setHeadings(sc.nextLine());

        Human[] humans = new Human[(int) (countLines - 1)];
        while (sc.hasNext()) {
            sc.useDelimiter("\\||\r\n");
            Human human = new Human(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt());
            humans[countHuman++] = human;
        }
        return humans;
    }
}

