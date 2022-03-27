package id.unitest.dog;

public class DogFood {
    private String name;
    private Integer weight;
    
    public DogFood(String name, Integer weight) {
    	this.name = name;
    	this.weight = weight;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setWeight(int weight) {
    	this.weight = weight;
    }
    public int getWeight() {
    	return this.weight;
    }
}