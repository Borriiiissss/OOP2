import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        ArrayList<Base> listLightSide = new ArrayList<>();
        fillListsOfHeroes(listLightSide, 1);
        ArrayList<Base> listDarkSide = new ArrayList<>();
        fillListsOfHeroes(listDarkSide, 2);

        
    }
    public static ArrayList<Base> fillListsOfHeroes(ArrayList<Base> list, int side) {
        int typeOFHero;

        for (int i = 0; i < 10; i++) {
            if (side == 1){ 
                typeOFHero = (int) (Math.ceil(Math.random() * 4));
            }
            else {
                typeOFHero = (int) ((Math.ceil(Math.random() * 4) + 3));
            }
            switch (typeOFHero) {
                case 1:
                    list.add(new Monk(list));
                    break;
                case 2:
                list.add(new Sniper(list));
                    break;
                case 3:
                    list.add(new Robber(list));
                    break;   
                case 4:
                    list.add(new Peasant(list));
                    break;   
                case 5:
                    list.add(new Spearman(list));
                    break;  
                case 6:
                    list.add(new Wizard(list));
                    break; 
                case 7:
                    list.add(new Xbowman(list));
                    break;  
                default:
                    break;
            }           
        }
        System.out.println("сторона " + side);
        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        // String classOfHero = "Monk";
        // printParamsOfHero(list, classOfHero);
        return list;
}

    public static void printParamsOfHero(ArrayList<Base> list, String classOfHero) {
        for (Base s : list) {
            if (s.getName() == classOfHero) {
                System.out.println(s.toString());
            }
        }
    }
    //     Monk monk00 = new Monk();
    //     monk00.getPlayerID();   
}