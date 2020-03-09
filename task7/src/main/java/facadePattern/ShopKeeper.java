package facadePattern;

public class ShopKeeper {
	private Kalakand k;  
    private Halwa h;       
    public ShopKeeper() {
        k= new Kalakand();  
        h=new Halwa();
    }  
    public void KalakandSale() {
        k.sweetName();  
        k.price();  
    }  
    public void HalwaSale() {  
        h.sweetName();  
        h.price();  
    }  
}
