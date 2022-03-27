package id.unitest.dog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {
 
    @Test
    public void createNewDog(){
        Dog myDog = new Dog("Jimmy", "Beagle");
        assertEquals("Error in creating a dog", "Jimmy",    myDog.getName());
    }
    
    @Test
    public void createNewWeightDog() {
    	Dog myDog = new Dog("Jimmy","Beagle");
    	assertEquals(10,myDog.getWeight());
    }
    
    @Test
    public void createNewAgeDog() {
    	Dog myDog = new Dog("Jimmy","Beagle");
    	assertEquals(7,myDog.getAge());
    }
    
    @Test 
    public void testEat() {
    	Dog myDog = new Dog("Jimmy", "Bitch");
    	DogFood dogFood = new DogFood("Royal Canin", 16);
    	myDog.setDogFood(dogFood);
    	myDog.eat();
    	assertEquals(26, myDog.getWeight());
    }
}
