import java.util.ArrayList;

public class Sniper extends Base {
    public Sniper(ArrayList<Base> group) {
        super(12, 10, 32, new int[]{8,10}, 15, 9, false, false, "Sniper");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}