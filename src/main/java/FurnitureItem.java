public class FurnitureItem {
    String ColorsOfFurniture="Red,Blue,Green";
    String GradeOfFurniture="Grade1,Grade2,Grade3";
    String TypeOfFurniture="Tables, Chairs,Cupboards, Stools";
    float Discount=5;
    String furnitureUsage="Outdoor";
    float price=1000;
    float discountedAmount;

    void Discounts() {
        if(furnitureUsage.equals("Outdoor")) {
            furnitureUsage = "Outdoor";
            float priceAfterDiscount = price - (price * 5) / 100;
            discountedAmount=priceAfterDiscount;
        }
        else
            furnitureUsage="Indoor";
    }
    void Display(){
        Discounts();
        System.out.println("Color of Furniture:- " +ColorsOfFurniture);
        System.out.println("Grade of Furniture:- " +GradeOfFurniture);
        System.out.println("Type Of Furniture :- "  +TypeOfFurniture);
        System.out.println("Furniture Price:-  "+price);
        System.out.println("Discount on Outdoor:-  "+Discount);
        System.out.println("Furniture Usage:-  "+furnitureUsage);
        System.out.println("Discounted Amount:-  "+discountedAmount);

    }
}

