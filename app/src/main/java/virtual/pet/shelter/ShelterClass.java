package virtual.pet.shelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShelterClass {
    //! Create a map
    private Map<String, PetClass> pets = new HashMap<>();
    private Map<String, PetClass> adopted = new HashMap<>();

    //! Create methods
    //! intake Pets
    public void inTakePets(String petName, int hunger, int thirst, int boredom){
        PetClass newPetClass = new PetClass(hunger, thirst, boredom);
        pets.put(petName, newPetClass);
    }

    //! asses new Pets
    public void assesNewPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("New Pet Assessment!");
        System.out.println("Please enter new Pet Name: ");
        String newPetName = scanner.nextLine();
        System.out.println("What is the Pet's % of Hunger? ");
        int newPetHunger = scanner.nextInt();
        System.out.println("What is the Pet's % of Thirst? ");
        int newPetThirst = scanner.nextInt();
        System.out.println("What is the Pet's % of Boredom? ");
        int newPetBoredom = scanner.nextInt();

        inTakePets(newPetName, newPetHunger, newPetThirst, newPetBoredom);
        System.out.println(newPetName + " has been admitted to the Shelter!");
        allPetInfo();
    }

    //! Adopt Pets
    public void adaptPets(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pet to be Adopted: ");
        allPetInfo();
        String adoptedPetName = scanner.nextLine();
        adopted.put(adoptedPetName, pets.get(adoptedPetName));
        pets.remove(adoptedPetName);
        System.out.println(adoptedPetName + " Successfully Adopted!");
    }

    //! Get all Pets
    public void allPetNames(){

    for(Map.Entry<String, PetClass> entry : pets.entrySet()){
        String key = entry.getKey();
        System.out.println("Pet Name: " + key + " Boredom Level " + entry.getValue().getBoredom() + "%");
    }
    }

    //! Get Pets by name
    public PetClass getPetByName(String petName){
        return pets.get(petName);
    }

    //! Display Pet info
    public void allPetInfo(){

            if(!pets.isEmpty()){
                System.out.println("Current in House Pets");
            }

    for(Map.Entry<String, PetClass> entry : pets.entrySet()){

        String key = entry.getKey();
        System.out.println("Pet Name: " + key + " |Hunger Level: " + pets.get(key).getHunger() + "%  |Thirst Level " + pets.get(key).getThirst() + "%  |Boredom Level " + pets.get(key).getBoredom() + "%"  );
    }
    }

    //! Display Adopted Pet info
        public void allAdoptedPets(){
            if(!adopted.isEmpty()){
                System.out.println("All Adopted Pets");
            }
        for(Map.Entry<String, PetClass> entry : pets.entrySet()){
        String key = entry.getKey();
        System.out.println("Pet Name: " + key);
        }
        }

    //! Play with Pet
    public void playPet(String petName){
        PetClass pet = pets.get(petName);
        pet.playPet();
    }

    //! Feed
            public void feedAllPets(){
        for(Map.Entry<String, PetClass> entry : pets.entrySet()){
        entry.getValue().feedPets();
        }
        }

    //! Water
            public void waterAllPets(){
        for(Map.Entry<String, PetClass> entry : pets.entrySet()){
        entry.getValue().waterPets();
        }
        }
    //! Tick
        public void tickTick(){
        for(Map.Entry<String, PetClass> entry : pets.entrySet()){
        entry.getValue().tick();
        }
        }



    }




