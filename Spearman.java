import java.util.ArrayList;

public class Spearman extends Base {
    public Spearman(ArrayList<Base> group) {
        super(4, 5, 0, new int[]{1,3}, 10, 4, false, false, "Spearman");
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {
        // TODO Auto-generated method stub
        
    }
}