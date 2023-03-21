package greenUsers;

public class HumanFilter {

    public Human[] humanFilter(Human[] arrayHuman, int maxConsumption) {
        int countGreenHuman = 0;
        for (Human human : arrayHuman) {
            if (human.getWaterCount() < maxConsumption && human.getGasCount1() + human.getGasCount2() < maxConsumption
                    && human.getElectricCount1() + human.getElectricCount2() < maxConsumption) {
                countGreenHuman++;
            }
        }
        Human[] resultHuman = new Human[countGreenHuman];
        for (int i = 0; i < resultHuman.length; i++) {
            if (arrayHuman[i].getWaterCount() < maxConsumption
                    && arrayHuman[i].getGasCount1() + arrayHuman[i].getGasCount2() < maxConsumption
                    && arrayHuman[i].getElectricCount1() + arrayHuman[i].getElectricCount2() < maxConsumption) {
                resultHuman[i] = arrayHuman[i];
            }
        }
        return resultHuman;
    }
}


