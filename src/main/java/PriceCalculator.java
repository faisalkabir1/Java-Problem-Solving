public class PriceCalculator {

    public static void main(String[] args) {
        String input = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        String[] numbers = input.replaceAll("[^0-9]+", " ").trim().split(" ");

        int laptopPrice = Integer.parseInt(numbers[1]);
        int mousePrice = Integer.parseInt(numbers[2]);
        int quantity = Integer.parseInt(numbers[3]);
        int discountPercent = Integer.parseInt(numbers[4]);

        int totalPrice = laptopPrice + (mousePrice * quantity);

        double discount = totalPrice * (discountPercent / 100.0);
        double finalPrice = totalPrice - discount;

        System.out.println("Laptop Price: " + laptopPrice + " tk");
        System.out.println("Mouse Price:" + (mousePrice * quantity) + " tk");
        //System.out.println("Total (before discount): " + totalPrice + " tk");
       // System.out.println("Discount (" + discountPercent + "%): " + discount + " tk");
        System.out.println("Total Cost: " + finalPrice + " tk");
    }
}
