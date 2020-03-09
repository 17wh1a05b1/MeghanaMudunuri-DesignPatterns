package epamTask7.task7;

abstract class Vehicle {
    protected Workshop ws1; 
    protected Workshop ws2; 
  
    protected Vehicle(Workshop ws1, Workshop ws2) {
    	this.ws1 = ws1; 
        this.ws2 = ws2; 
    } 
    abstract public void manufacture(); 
} 

class Car extends Vehicle { 
    public Car(Workshop ws1, Workshop ws2) { 
        super(ws1, ws2); 
    } 
    public void manufacture() { 
        System.out.print("Car "); 
        ws1.work(); 
        ws2.work(); 
    } 
} 
  
class Bus extends Vehicle { 
    public Bus(Workshop ws1, Workshop ws2) { 
        super(ws1, ws2); 
    }
    public void manufacture() { 
        System.out.print("Bus "); 
        ws1.work(); 
        ws2.work(); 
    } 
} 

interface Workshop { 
    abstract public void work(); 
} 

class Produce implements Workshop {
    public void work() { 
        System.out.print("Produced"); 
    } 
}

class Assemble implements Workshop {
    public void work() {
        System.out.println(" And Assembled."); 
    }
} 

public class BridgePattern {
	public static void main(String[] args) 
    { 
        Vehicle v1 = new Car(new Produce(), new Assemble()); 
        v1.manufacture(); 
        Vehicle v2 = new Bus(new Produce(), new Assemble()); 
        v2.manufacture(); 
    } 
}
