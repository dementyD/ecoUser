package greenUsers;

public class StringFormat {

    public String stringFormat(Human[] human) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Human.getHeadings()).append("\n");

        for (Human value : human) {
            if (value != null) {
                String string = value.getId() + "|" + value.getName() + "|" + value.getWaterCount() + '|' +
                        value.getGasCount1() + "|" + value.getGasCount2() + "|" + value.getElectricCount1() +
                        "|" + value.getElectricCount2();

                stringBuilder.append(string).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
