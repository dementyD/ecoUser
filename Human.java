package greenUsers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Human {
    private int id;
    private String name;
    private int waterCount;
    private int gasCount1;
    private int gasCount2;
    private int electricCount1;
    private int electricCount2;
    private static String headings;

    public Human() {
    }

    private Human(int id, String name, int waterCount, int gasCount1,
                  int gasCount2, int electricCount1, int electricCount2) {
        this.id = id;
        this.name = name;
        this.waterCount = waterCount;
        this.gasCount1 = gasCount1;
        this.gasCount2 = gasCount2;
        this.electricCount1 = electricCount1;
        this.electricCount2 = electricCount2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGasCount1() {
        return gasCount1;
    }

    public int getGasCount2() {
        return gasCount2;
    }

    public int getElectricCount1() {
        return electricCount1;
    }

    public int getElectricCount2() {
        return electricCount2;
    }

    public int getWaterCount() {
        return waterCount;
    }


    public static String getHeadings() {
        return headings;
    }

    public Human[] readToArrayHuman(Path path) {
        long count = 0;
        try {
            count = Files.lines(path).count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Human[] humans = new Human[(int) (count - 1)];
        try {
            Scanner scanner = new Scanner(path);
            headings = scanner.nextLine();
            int countHuman = 0;
            while (scanner.hasNext()) {
                scanner.useDelimiter("\\||\r\n");
                id = scanner.nextInt();
                name = scanner.next();
                waterCount = scanner.nextInt();
                gasCount1 = scanner.nextInt();
                gasCount2 = scanner.nextInt();
                electricCount1 = scanner.nextInt();
                electricCount2 = scanner.nextInt();

                Human human = new Human(id, name, waterCount, gasCount1,
                        gasCount2, electricCount1, electricCount2);
                humans[countHuman++] = human;
            }
        } catch (IOException e) {
            System.out.println("файл не найден");
        }
        return humans;
    }
}


