package epamTask7.task7;

interface Bird {
	public void fly(); 
	public void makeSound(); 
} 
	  
class Parrot implements Bird {
	public void fly() {
		System.out.println("Flying"); 
	} 
	public void makeSound() {
		System.out.println("Tweeting"); 
	} 
} 
	  
interface Toybird {
	public void chirp(); 
} 
	  
class PlasticToyBird implements Toybird {
	public void chirp() {
		System.out.println("Chirping"); 
	} 
} 
	  
class BirdAdapter implements Toybird {
	Bird b; 
	public BirdAdapter(Bird b) {
		this.b = b; 
	} 
	public void chirp() {
		b.makeSound(); 
	} 
} 

public class AbstractPattern {
	public static void main(String args[]) {
		Parrot p = new Parrot(); 
	    Toybird Tb = new PlasticToyBird(); 
	    Toybird birdAdapter = new BirdAdapter(p); 
	    System.out.println("Parrot..."); 
	    p.fly(); 
	    p.makeSound();
	    System.out.println("\nToyBird..."); 
	    Tb.chirp(); 
	    System.out.println("\nBirdAdapter..."); 
	    birdAdapter.chirp(); 
	} 
}

