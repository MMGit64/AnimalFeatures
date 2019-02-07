import java.util.Arrays;

public class Animal {
	public static void main(String args[]) {
		Lion Mufasa = new Lion("Scar", 30, false, 129);
	    Mufasa.setLionType();
	    System.out.println(Mufasa);
	    	
	    Cheetah spottedCat = new Cheetah("Zari", 28, true, 73);
	    spottedCat.setCheetahFeatures();
	    System.out.println(spottedCat);
	    }
	
	private String name;
	private int numTeeth = 0;
    private boolean spots = false;
    private int weight = 0;
   
    // Default Constructor
    
    public Animal(String name, int numTeeth, boolean spots, int weight){
    	this.setName(name);
        this.setNumTeeth(numTeeth);
        this.setSpots(spots);
        this.setWeight(weight);
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
     
    public int getNumTeeth(){
        return numTeeth;
    }
 
    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }
     
    public boolean getSpots() {
        return spots;
    }
 
    public void setSpots(boolean spots) {
        this.spots = spots;
    }
 
    public int getWeight() {
        return weight;
    }
 
    public void setWeight(int weight) {
        this.weight = weight;
    }
   
}


class Lion extends Animal {
    private String lionType;

    Lion(String name, int numTeeth, boolean spots, int weight){
        super(name, numTeeth, spots, weight);
    }


    public void setLionType() {
        if(super.getName() == "Simba"){
            this.lionType = "a Cub";
        }
        else if(super.getName() == "Nala") {
            this.lionType = "Female";
        }
        else if(super.getName() == "Mufasa") {
        	this.lionType = "Male";
        }
        else if(super.getName() == "Scar") {
        	this.lionType = "Evil";
        }
        else {
        	this.lionType = "Not a Lion";
        }
    }

    public String getLionType() {
       return this.lionType;
    }

    public String toString(){
     return "Your Lion is " + getLionType();
    }


 }
  

class Cheetah extends Animal {
	private String Cheetahfeatures;
	Cheetah(String name, int numTeeth, boolean spots, int weight){
        super(name, numTeeth, spots, weight);
    }
	
	 public void setCheetahFeatures() {
		  super.getName();
	      super.getWeight(); 
	      super.getSpots();
	      super.getNumTeeth();
	    }

	   // public String getCheetahFeatures() {
	    //    return this.getCheetahFeatures();
	   // }
	    
	    String[] arrayName = {getName()};
	    long [] arrayNumTeeth = {getNumTeeth()};
	    boolean[] arraySpots = {getSpots()};
	    long[] arrayWeight = {getWeight()};
	    
	    public String toString(){
	     return "The features of the cheetah " + Arrays.toString(arrayName) + " are: \n " + "Number of teeth: " + Arrays.toString(arrayNumTeeth) + "\n Spots: " + Arrays.toString(arraySpots) + "\n Weight: " + Arrays.toString(arrayWeight) +" kgs";
	    }

 }



