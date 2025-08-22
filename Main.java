import drink.Tea;
import drink.coffee.Coffee;
import drink.coffee.Frappe;
import drink.coffee.Latte;
import enums.DrinkSize;
import machine.CoffeeMachine;

import javax.xml.stream.StreamFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
import static example.StreamsExample.streamFilter;
import static example.StreamsExample.streamReduce;

public class Main {

    public static void main(String[] args) {



        streamReduce();




       /* forLoopSimpleEnhanced(LocalDate.of(2025,3,18),LocalDate.of(2025,3,25),2L);
        forEachLoop();
        Map<Integer, String> numbersMap = new HashMap<Integer, String>();
        numbersMap.put(1,"1");
        numbersMap.put(2,"2");
        numbersMap.put(3,"3");
       //System.out.println(numbersMap);

        String value3 = numbersMap.get(3);
      //System.out.println(value3);

        numbersMap.remove(2);
       //System.out.println(numbersMap);
        */

        /*var coffeeMachine = new CoffeeMachine();
        Coffee coffee = new Coffee("Cappuccino",300,false,50, DrinkSize.M);
        System.out.println(coffee.recognizeMe());

        Frappe frappe = new Frappe("Frappe",300,true,100,DrinkSize.L);
        System.out.println(frappe.recognizeMe());

        System.out.println(coffee);

        Latte latte = new Latte(DrinkSize.M);
        System.out.println(latte);

        System.out.println("Choose drink from the menu: coffee, tea, water, lemonade");
        String drinkOrder = getUserInput();
        System.out.printf("You choose: %s\n", drinkOrder);

        System.out.println("Choose drink size: S, M, L");
        DrinkSize drinkSize = DrinkSize.valueOf(getUserInput());
        System.out.printf("You choose: %s size\n", drinkSize);

        if ("coffee".equals(drinkOrder)) {
            System.out.println("Choose drink from the menu: cappuccino, latte, espresso, frappe");
            String coffeeOrder = getUserInput();
            System.out.printf("You choose: %s\n", coffeeOrder);

           var myDrink = coffeeMachine.makeDrink(coffeeOrder,drinkSize);
            System.out.printf("This is your order: %s", myDrink);
        } else if ("tea".equals(drinkOrder)) {
            Tea teaDrink = new Tea("Earl Grey",300,false,DrinkSize.M);
            System.out.println(teaDrink);
        }
    }

    private static String getUserInput()  {
        String coffeeOrder = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            coffeeOrder = reader.readLine();
        } catch (IOException e) {
            System.out.printf("Something went wrong: %s%n", e.getMessage());
        }
        return coffeeOrder;*/
    }

}
