// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("java",200,"Developer");
        Book b2 = new Book();

        b2.setName("python");
        b2.setPrice(150);
        b2.setAuthor("Software engineer");

        System.out.println(b1.toString()+"the discount is "+b1.getDiscount());

        System.out.println("Name= "+b2.getName()+" Price= "+b2.getPrice()+" Author= "+b2.getAuthor()+"the price after 25% discount  "+b2.getDiscount());

//////////////////////////////

        Movie m1 = new Movie("the little mermaid",30," Rob Marshall");

        Movie m2 = new Movie();

        m2.setName("Cinderella");
        m2.setPrice(40);
        m2.setDirector("Kenneth Branagh");


        System.out.println(m1.toString()+"the discount is "+m1.getDiscount());

        System.out.println("Name= "+m2.getName()+" Price= "+m2.getPrice()+" Director= "+m2.getDirector()+"\"the price after 40% discount "+m2.getDiscount());







    }
}