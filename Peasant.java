import java.util.ArrayList;

public class Peasant extends Base {

    public Peasant(ArrayList<Base> group) {
        super(1, 1, 0, new int[]{1,1}, 1, 3, true, false, "Peasant");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}