package greenUsers;

public class HumanFilter {

    public Human[] humanFilter(Human[] arrayHuman, int maxConsumption) {
        Human[] resultHuman = new Human[arrayHuman.length];
        for (int i = 0; i < arrayHuman.length; i++) {
            if (arrayHuman[i].getWaterCount() < maxConsumption
                    && arrayHuman[i].getGasCount1() + arrayHuman[i].getGasCount2() < maxConsumption
                    && arrayHuman[i].getElectricCount1() + arrayHuman[i].getElectricCount2() < maxConsumption) {
                resultHuman[i] = arrayHuman[i];
            }
        }
        return resultHuman;
    }
}

