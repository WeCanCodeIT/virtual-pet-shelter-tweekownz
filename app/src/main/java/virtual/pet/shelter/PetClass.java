package virtual.pet.shelter;

public class PetClass {
//? Attributes-------------------------------------------------------------------------------------------------|
private static int hunger;
private static int thirst;
private static int boredom;


//? Constructors-----------------------------------------------------------------------------------------------|
public PetClass(int hunger, int thirst, int boredom) {
    PetClass.hunger = hunger;
    PetClass.thirst = thirst;
    PetClass.boredom = boredom;
}

//? Getters and Setters----------------------------------------------------------------------------------------|
public int getHunger() {
    return hunger;
}


public void setHunger(int hunger) {
    PetClass.hunger = hunger;
}


public int getThirst() {
    return thirst;
}


public void setThirst(int thirst) {
    PetClass.thirst = thirst;
}


public int getBoredom() {
    return boredom;
}


public void setBoredom(int boredom) {
    PetClass.boredom = boredom;
}

//! Methods----------------------------------------------------------------------------------------------------------

public static void tick(){
    hunger += 10;
    thirst += 10;
    boredom += 10;
    ShelterClass.allPetInfo();
}


public static void feedPets(){
    hunger -= 30;
    thirst += 10;
    boredom += 10;
}

public static void waterPets(){
    hunger += 10;
    thirst -= 30;
    boredom += 10;
}

public static void playWithPet(){
    hunger += 10;
    thirst += 10;
    boredom -= 50;
}


    
}
