import java.util.ArrayList;

public class Xbowman extends Base {
    public Xbowman(ArrayList<Base> group) {
        super(6, 3, 16, new int[]{2,3}, 10, 4, false, false, "Xbowman");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}