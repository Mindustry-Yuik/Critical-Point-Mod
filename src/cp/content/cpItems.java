package cp.content;


import arc.graphics.Color;
import mindustry.type.Item;

public class cpItems {

    public static Item
    Ether,darkMatter;
    public static void load() {

       Ether = new Item("Ether", Color.valueOf("80366BFF")){{
           radioactivity = 0.45f;
           explosiveness = 0.1f;
           charge = 15f;//放电性
           cost = 2;
       }};

        darkMatter = new Item("darkMatter",Color.valueOf("463D5AFF")){{
            radioactivity = 5f;
            explosiveness = 3f;
            charge = 15f;
            cost = 14;
        }};


    }

}
