package virtual.pet.shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShelterClassTest {
    @Test
    void testAdaptPets() {

    }

    @Test
    void testFeedAllPets() {
        ShelterClass shelter = new ShelterClass();
        shelter.inTakePets("Baxter", 10, 15, 20);
        shelter.feedAllPets(); 
        assertEquals(-20, shelter.getPetByName("Baxter").getHunger());
    }

    @Test
    void testPlayPet() {
        ShelterClass shelter = new ShelterClass();
        shelter.inTakePets("Baxter", 10, 10, 20);
        shelter.playPet("Baxter");
        assertEquals(-30, shelter.getPetByName("Baxter").getBoredom());

    }

    @Test
    void testTickTick() {
        ShelterClass shelter = new ShelterClass();
        shelter.inTakePets("Baxter", 10, 10, 20);
        shelter.tickTick();
        assertEquals(20, shelter.getPetByName("Baxter").getHunger());
        assertEquals(20, shelter.getPetByName("Baxter").getThirst());
        assertEquals(30, shelter.getPetByName("Baxter").getBoredom());
    }

    @Test
    void testWaterAllPets() {
        ShelterClass shelter = new ShelterClass();
        shelter.inTakePets("Baxter", 10, 10, 20);
        shelter.waterAllPets(); 
        assertEquals(-20, shelter.getPetByName("Baxter").getThirst());
    }
}
