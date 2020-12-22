package interfaces.animal;

import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimal() {
        return animals.size();
    }

    public int getNumberOfLegs() {
        int sumNumberOfLegs = 0;
        for (Animal element: animals) {
            sumNumberOfLegs += element.getNumberOfLegs();
        }
        return sumNumberOfLegs;
    }

}
