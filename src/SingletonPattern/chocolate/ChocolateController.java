public class ChocolateController {
    public static void main(String[] args){
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        // judge whether they are the same object
        System.out.println(boiler.hashCode());
        System.out.println(boiler2.hashCode());
    }
}