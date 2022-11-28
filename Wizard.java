import java.util.ArrayList;

public class Wizard extends Base {
    public Wizard(ArrayList<Base> group) {
        super(17, 12, 0, new int[]{-5,-5}, 30, 9, false, true, "Wizard");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}