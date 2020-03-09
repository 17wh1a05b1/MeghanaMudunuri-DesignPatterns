package epamTask7.task7;

interface MobileAlertState {
	public void alert(AlertState as); 
} 
  
class AlertState { 
    private MobileAlertState currentState; 
    public AlertState() { 
        currentState = new Vibration(); 
    } 
    public void setState(MobileAlertState state) { 
        currentState = state; 
    } 
    public void alert() { 
        currentState.alert(this); 
    } 
}
  
class Vibration implements MobileAlertState {
	public void alert(AlertState as) { 
         System.out.println("Phone is in Vibration"); 
    } 
}
  
class Silent implements MobileAlertState { 
    public void alert(AlertState as) { 
        System.out.println("Phone is in Silent"); 
    } 
}

public class StatePattern {
	public static void main(String[] args)  
    { 
        AlertState stateContext = new AlertState(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new Silent()); 
        stateContext.alert();
    } 
}
