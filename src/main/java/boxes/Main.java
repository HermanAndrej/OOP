package boxes;

public class Main {
    public static void main(String[] args){
        /*
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));
         */

        /*
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
         */

        /*
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
         */

        Box box1 = new MaxWeightBox(15);
        Box box2 = new BlackHoleBox();
        Box box3 = new OneThingBox();
        Thing box4 = new Thing("Blink182", 5);

        if(box1 instanceof MaxWeightBox){
            MaxWeightBox maxWeightBox = (MaxWeightBox) box1;
        }

        if(box2 instanceof BlackHoleBox){
            BlackHoleBox blackHoleBox = (BlackHoleBox) box2;
        }

        if(box3 instanceof OneThingBox){
            OneThingBox oneThingBox = (OneThingBox) box3;
        }

        if(box4 instanceof Thing){
            Thing thing = (Thing) box4;
        }


    }
}
