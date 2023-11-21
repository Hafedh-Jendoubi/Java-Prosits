package tn.esprit.gestionzoo.interfaces;

public interface Omnivore<T> extends Herbivore, Carnivore {
    @Override
    void eatMeat(Object meat);

    @Override
    void eatPlant(Object plant);

    void eatPlantAndMeet(T food);
}
