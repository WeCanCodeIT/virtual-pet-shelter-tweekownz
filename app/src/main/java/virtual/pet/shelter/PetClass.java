package virtual.pet.shelter;

public class PetClass {
//? Attributes-------------------------------------------------------------------------------------------------|
private int hunger;
private int thirst;
private int boredom;


//? Constructors-----------------------------------------------------------------------------------------------|
public PetClass(int hunger, int thirst, int boredom) {
    this.hunger = hunger;
    this.thirst = thirst;
    this.boredom = boredom;
}

//? Getters and Setters----------------------------------------------------------------------------------------|
public int getHunger() {
    return this.hunger;
}


public void setHunger(int hunger) {
    this.hunger = hunger;
}


public int getThirst() {
    return this.thirst;
}


public void setThirst(int thirst) {
    this.thirst = thirst;
}


public int getBoredom() {
    return this.boredom;
}


public void setBoredom(int boredom) {
    this.boredom = boredom;
}

//! Methods----------------------------------------------------------------------------------------------------------
public void tick(){
    hunger += 10;
    thirst += 10;
    boredom += 10;
}

public void feedPets(){
    this.hunger -= 30;
}

public void waterPets(){
    this.thirst -= 30;
}

public void playPet(){
    this.boredom -= 50;
}

    
}
