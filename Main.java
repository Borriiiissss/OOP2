import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        ArrayList<Base> list = new ArrayList<>();
        int typeOFHero;
        for (int i = 0; i < 50; i++) {
            typeOFHero = (int) (Math.ceil(Math.random() * 7));
            switch (typeOFHero) {
                case 1:
                    list.add(new Monk());
                    break;
                case 2:
                    list.add(new Peasant());
                    break;
                case 3:
                    list.add(new Robber());
                    break;   
                case 4:
                    list.add(new Sniper());
                    break;   
                case 5:
                    list.add(new Spearman());
                    break;  
                case 6:
                    list.add(new Wizard());
                    break; 
                case 7:
                    list.add(new Xbowman());
                    break;  
                default:
                    break;
            }           
        }
        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        String classOfHero = "Monk";
        printParamsOfHero(list, classOfHero);
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