package epamTask7.task7;

interface ItemElement { 
    public int accept(ShoppingCartVisitor visitor); 
} 
  
class Book implements ItemElement { 
    private int price;
    public Book(int cost) { 
        this.price=cost;
    } 
    public int getPrice() { 
        return price; 
    } 
    public int accept(ShoppingCartVisitor visitor) { 
        return visitor.visit(this); 
    } 
}
  
class Fruit implements ItemElement { 
    private int price;
    private String name; 
    public Fruit(int p, String n) { 
        this.price=p; 
        this.name = n; 
    } 
    public int getPrice() { 
        return price; 
    } 
    public String getName() { 
        return this.name;
    } 
    public int accept(ShoppingCartVisitor visitor) { 
        return visitor.visit(this);
    }
}
  
interface ShoppingCartVisitor { 
    int visit(Book book); 
    int visit(Fruit fruit); 
} 
  
class ShoppingCartVisitorImpl implements ShoppingCartVisitor { 
    public int visit(Book book) { 
        int cost=0;
        cost = book.getPrice(); 
        System.out.println("Book cost = "+cost); 
        return cost; 
    } 
    public int visit(Fruit fruit) { 
        int cost = fruit.getPrice(); 
        System.out.println(fruit.getName() + " cost = "+cost); 
        return cost; 
    }
} 

public class VisitorPattern {
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{ new Book(100), new Fruit(30, "Bananas"), new Fruit(50, "Apples")}; 
	    int total = calculatePrice(items); 
	    System.out.println("Total Cost = "+total); 
	} 
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl(); 
	    int sum=0; 
	    for(ItemElement item : items) {
	    	sum = sum + item.accept(visitor); 
	    } 
	    return sum; 
	}
}
