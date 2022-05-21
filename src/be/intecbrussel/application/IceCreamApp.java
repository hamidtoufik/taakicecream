package be.intecbrussel.application;

import be.intecbrussel.eatable.Cone;
import be.intecbrussel.eatable.Eatable;
import be.intecbrussel.eatable.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

import java.util.Scanner;

//--------------------------deze gedeelt heb ik met Axel gedaan want teveel bugs---------------------------------------
public class IceCreamApp {

    public static void main(String[] args) {

        int number, counter = 0;

        PriceList priceList = new PriceList();
        Stock stock = new Stock();
        Scanner keyboardReader = new Scanner(System.in);
        Eatable[] myIceCream = new Eatable[100];

//---------------------------------------------------------------------------------------------------------
        IceCreamCar myIceCreamCar = new IceCreamCar(priceList, stock);
        //do while gebruiken om minstens een keer te gaan gebruiken
        do {
            System.out.println("you want some ice? 1 = YES");
            if (keyboardReader.nextInt() != 1) {
                System.out.println("get lost!");
                for (int index =0; index<counter;index++){
                    myIceCream[index].eat();

                }
                System.out.println("totale winst: " + myIceCreamCar.getProfit());
                System.exit(0);
            }
//-----------------------------------------------------------------------------------------------------------------
            System.out.println("your choice?\n1 = Cone\n2 = IceRocket\n3 = Magnum");

            switch (keyboardReader.nextInt()) {
                case 1:
                    System.out.println("How many balls would you like? 1 - 5");
                    int amountOfBalls = keyboardReader.nextInt();
                    Cone.Flavors[] flavors = new Cone.Flavors[amountOfBalls];

                    for (int index = 0; index < amountOfBalls; index++) {
                        System.out.println("What flavor would you like?\n1 = STRAWBERRY\n2 = BANANA\n3 = CHOCOLATE\n4 = VANILLA\n5 = LEMON\n6 = STRACIATELLA\n7 = MOKKA\n8 = PISTACHE");
                        flavors[index] = IceCreamApp.flavorPickerCone(keyboardReader.nextInt());
                        keyboardReader.nextLine();
                    }

                    break;

                case 2:
                    System.out.println("One IceRocket, coming your way!");
                    myIceCream[counter++] = myIceCreamCar.orderIceRocket();

                    break;

                case 3:
                    System.out.println("what flavor?\n1 = MILKCHOCOLATE\n2 = WHITECHOCOLATE\n3 = BLACKCHOCOLATE\n4 = ALPINENUTS\n5 = ROMANTICSTRAWBERRIES");
                    myIceCream[counter++] = myIceCreamCar.orderMagnum(flavorPickerMagnum(keyboardReader.nextInt()));
                    System.out.println("Here you go, one Magnum!");
                    break;

                default:
                    System.out.println("That wasn't an option, sorry.");
                    break;
            }
        } while (number == 0);


    }
//---------------------------------------------------------------------------------------------------------------
    public static Cone.Flavors flavorPickerCone(int flavor) {
        switch (flavor) {
            case 1:
                return Cone.Flavors.STRAWBERRY;
            case 2:
                return Cone.Flavors.BANAAN;
            case 3:
                return Cone.Flavors.CHOCO;
            case 4:
                return Cone.Flavors.VANILLA;
            case 5:
                return Cone.Flavors.LEMON;
            case 6:
                return Cone.Flavors.STRACIATELLA;
            case 7:
                return Cone.Flavors.MOKKA;
            case 8:
                return Cone.Flavors.PISTACHE;
            default:
                return Cone.Flavors.VANILLA;
        }
    }
//-----------------------------------------------------------------------------------------------------------------
    public static Magnum.Magnumtype flavorPickerMagnum(int flavor) {

        switch (flavor) {
            case 1:
                return Magnum.Magnumtype.MILKCHOCOLATE;
            case 2:
                return Magnum.Magnumtype.WHITECHOCOLATE;
            case 3:
                return Magnum.Magnumtype.BLACKCHOCOLATE;
            case 4:
                return Magnum.Magnumtype.ALPINENUTS;
            case 5:
                return Magnum.Magnumtype.ROMANTICSTRAWBERRIES;
            default:
                return Magnum.Magnumtype.MILKCHOCOLATE;
        }
    }


}
