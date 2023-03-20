package greenUsers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static final String NEW_FILE_NAME = "\\dataGreenDude.csv";

    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу и число максимального потребления");
        Scanner scannerInputInfo = new Scanner(System.in);
        String filePath = scannerInputInfo.next();
        int maxConsumption = scannerInputInfo.nextInt();

        Path path = Path.of(filePath);
        Path newPath = Path.of(path.getParent() + NEW_FILE_NAME);

        Human[] read = new Human().readToArrayHuman(path);
        Human[] humanFilter = new HumanFilter().humanFilter(read, maxConsumption);
        StringFormat stringFormat = new StringFormat();

        Files.writeString(newPath, stringFormat.stringFormat(humanFilter));
    }
}
