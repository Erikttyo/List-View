package com.firman.belajar.palmerahapps.contoh;

import com.firman.belajar.palmerahapps.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Firman on 1/25/2019.
 */
public class SampleDataProvider {

    public static List<DataItem> dataItems;
    public static Map<String, DataItem> dataItemMap;

    static {
        dataItems = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null, "Ayam Penyet", "Ayam",
                "Our quinoa salad is served with quinoa, tomatoes, cucumber, scallions, and smoked salmon. Served with your choice of dressing.",
                1, 12000, "ayam_penyet.jpg"));

        addItem(new DataItem(null, "Ayam Taliwang", "Ayam",
                "The chef’s salad has cucumber, tomatoes, red onions, mushrooms, hard_boiled eggs, cheese, and hot grilled chicken on a bed of romaine lettuce. Served with croutons and your choice of dressing.",
                2, 9000, "ayam_taliwang.jpg"));

        addItem(new DataItem(null, "Bakmi", "Mie",
                "Our house salad is made with romaine lettuce and spinach, topped with tomatoes, cucumbers, red onions and carrots. Served with a dressing of your choice.",
                3, 7000, "bakmi.jpg"));

        addItem(new DataItem(null, "Bakso", "Jajanan",
                "Choose from our fresh local, organically grown ingredients to make a custom salad.",
                4, 10000, "bakso.jpg"));

        addItem(new DataItem(null, "Bika Ambon", "Jajanan",
                "These mini cheeseburgers are served on a fresh baked pretzel bun with lettuce, tomato, avocado, and your choice of cheese.",
                1, 8000, "bika.jpg"));

        addItem(new DataItem(null, "Cendol", "Jajanan",
                "Large mushroom caps are filled a savory cream cheese, bacon and panko breadcrumb stuffing, topped with cheddar cheese.",
                2, 7000, "cendol.jpg"));

        addItem(new DataItem(null, "Gado Gado", "Sayur",
                "Caramelized onions slow cooked in a savory broth, topped with sourdough and a provolone cheese blend. Served with sourdough bread.",
                3, 7000, "gado_gado.jpg"));

        addItem(new DataItem(null, "Jengkol", "Sayur",
                "Our artichokes are brushed with an olive oil and rosemary blend and then broiled to perfection. Served with a side of creamy garlic aioli.",
                4, 9000, "jengkol.jpg"));

        addItem(new DataItem(null, "Kangkung", "Sayur",
                "SOME SAY OUR EGGS ARE DEVILISHLY GOOD. I HAVE TO AGREE.\n" +
                        "These delectable little bites are made with organic eggs, fresh Parmesan, and chopped pine nuts.\"",
                5, 8000, "kangkung.jpg"));

        addItem(new DataItem(null, "Kolak", "Jajanan",
                "Our classic burger is made with 100% pure angus beef, served with lettuce, tomatoes, onions, pickles, and cheese of your choice. Veggie burger available upon request. Served with French fries, fresh fruit, or a side salad.",
                1, 10000, "kolak.jpg"));

        addItem(new DataItem(null, "Mie Campur", "Mie",
                "This classic cheese tortellini is cooked in a sundried tomato sauce. Served with bruschetta topped with a tomato and basil marinara.",
                2, 14000, "mie_campur.jpg"));

        addItem(new DataItem(null, "Nasi Goreng", "Jajanan",
                "Our thin crust pizzas are made fresh daily and topped with your choices of fresh meats, veggies, cheese, and sauce.  Price includes two toppings. Add $1 for each additional topping.",
                3, 10000, "nasi_goreng.jpg"));

        addItem(new DataItem(null, "Otak otak", "Sayur",
                "Our barbecued skewers include tofu, cherry tomatoes, bell peppers, and zucchini marinated in a ginger sesame sauce and charbroiled. Served with steamed rice.",
                4, 10000, "otakotak.jpg"));

        addItem(new DataItem(null, "Pecel Blitar", "Sayur",
                "This platter is perfect for sharing! Enjoy our spicy buffalo wings, traditional nachos, and cheese quesadillas served with freshly made guacamole dip.",
                5, 16000, "pecel_blitar.jpg"));

        addItem(new DataItem(null, "Pecel Lele", "sayur",
                "Elegantly crafted creamy vanilla custard with a caramelized crunchy layer on top. Served with seasonal fruit.",
                1, 9000, "pecel_lele.jpg"));

        addItem(new DataItem(null, "Pepes Ikan", "Sayur",
                "Our New York Style Cheesecake is rich, smooth, and creamy. Available in various flavors, and with seasonal fruit toppings.",
                2, 9000, "pepes_ikan.jpg"));

        addItem(new DataItem(null, "Rendang ", "Ikan",
                "A warm chocolate chip brownie served with chocolate or vanilla ice cream and rich chocolate sauce.",
                3, 6000, "rendang.jpg"));

        addItem(new DataItem(null, "Sate Ayam", "Ikan",
                "Made with local granny smith apples to bring you the freshest classic apple pie available.",
                4, 5000, "sate_ayam.jpg"));

        addItem(new DataItem(null, "Sayur Asem", "Sayur",
                "Raspberries, blueberries, and strawberries on top of a creamy filling served in a crispy tart.",
                5, 7000, "sayur_asem.jpg"));

        addItem(new DataItem(null, "Soto Betawi", "Sayur",
                "This blueberry mint_based smoothie is refreshing and perfect for any celebration.",
                1, 6000, "soto_betawi.jpg"));

        addItem(new DataItem(null, "Tahu Gedjrot", "Sayur",
                "Our unique blend of pomegranate juice, black Rubio, and mint tea creates this light fusion of flavors.  ",
                2, 4000, "tahu_gejrot.jpg"));

        addItem(new DataItem(null, "Tempe", "Sayur",
                "Our house blend of espresso and foamed milk. Can be served with flavored syrups and over ice.  Non_dairy substitutions available upon request.",
                3, 6000, "tempe.jpg"));
    }

    private static void addItem(DataItem item) {
        dataItems.add(item);
        dataItemMap.put(item.getItemName(), item);

    }
}
