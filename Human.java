package greenUsers;

public class Human {
    private int id;
    private String name;
    private int waterCount;
    private int gasCount1;
    private int gasCount2;
    private int electricCount1;
    private int electricCount2;
    private static String headings;

    public Human(int id, String name, int waterCount, int gasCount1,
                 int gasCount2, int electricCount1, int electricCount2) {
        this.id = id;
        this.name = name;
        this.waterCount = waterCount;
        this.gasCount1 = gasCount1;
        this.gasCount2 = gasCount2;
        this.electricCount1 = electricCount1;
        this.electricCount2 = electricCount2;
    }

    public static void setHeadings(String headings) {
        Human.headings = headings;
    }

    public static String getHeadings() {
        return headings;
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

}




