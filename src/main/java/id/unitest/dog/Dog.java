package id.unitest.dog;

public class Dog {
    private String mDogName;
    private String mDogBreed;
    private int mDogAge;
    private int mDogWeight;
    private boolean mDogIsHappy;
    private DogFood dogFood; 
    public Dog(String name, String breed){
        this.mDogName = name;
        this.mDogBreed = breed;
        this.mDogWeight = 10;
        this.mDogAge = 7;
        extracted();
    }
	private DogFood extracted() {
		return this.dogFood = dogFood;
	}
    public String getName(){
        return mDogName;
    }
    public void setName(String name){
        mDogName = name;
    }
    public int getAge(){
        return mDogAge;
    }
    public void setAge(int age){
        mDogAge = age;
    }
    public void setDogFood(DogFood dogFood) {
    	this.dogFood = dogFood;
    }
    public int getWeight(){
        return mDogWeight;
    }
    public void setWeight(int weight){
        mDogWeight = weight;
    }
    public void eat(){
        System.out.println("Yuum that was delicious");
        this.mDogWeight += dogFood.getWeight();
    }
    public void play(){
        mDogIsHappy = true;
    }
}