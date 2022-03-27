package id.unitest.dog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogFoodTest {

	@Test
	public void createNewDogFood() {
		DogFood myDogFood = new DogFood("Royal Canin", 20);
		assertEquals("Error in creating a dogfood", "Royal Canin", myDogFood.getName());
	}
	
	@Test
	public void createNewWeightDogFood() {
		DogFood myDogFood = new DogFood("Royal Canin", 20);
		assertEquals(20, myDogFood.getWeight());
	}

}
