package cp.content;


import mindustry.type.Item;

public class cpItems {

    public static Item
    Ether;
    public static void load() {

       Ether = new Item("Ether"){{
           radioactivity = 2.5f;
           explosiveness = 3f;
           charge = 15f;
           cost = 2;
       }};

    }

}
