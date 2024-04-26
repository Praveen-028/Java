class Sale{
    String title;
    String author;
    String publication;
    int price;
    public void input(String title,String author,String publication,int price)
    {
        this.author=author;
        this.title=title;
        this.publication=publication;
        this.price=price;
    }
    public void display(){
        System.out.println("The Author of the book is :"+this.author);
        System.out.println("The Title of the book is :"+this.title);
        System.out.println("The Publication of the book is :"+this.publication);
        System.out.println("The price of the book is :"+this.price);
    }
}
class Purchase extends Sale{
    int noc;
    int amount;
    public void accept(String title,String author,String publication,int price,int noc)
    {
        super.input(title,author,publication,price);
        this.noc=noc;
    }
    public void calculate()
    {
        this.amount=this.noc*this.price;
    }
    public void show()
    {
        super.display();
        System.out.println("The number of copies purchased is :"+this.noc);
        System.out.println("The number of amount to be paid is :"+this.amount);
    }
}

public class seventh{
    public static void main(String[]args)
    {
        Purchase obj = new Purchase();
        obj.accept("The tale of the gutsy ninja", "Jiraya", "BW-02", 200, 2);
        obj.calculate();
        obj.show();
    }
}