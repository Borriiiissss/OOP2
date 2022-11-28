import java.util.ArrayList;

public class Robber extends Base{
    public Robber(ArrayList<Base> group) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}