package сollections.set;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Glass> glassSet = new HashSet<>();

        Glass wineglass = new Glass("glass",350.0);
        Glass beerGlass = new Glass("metal",500.0);

        System.out.println(glassSet.add(wineglass));
        System.out.println(glassSet.add(beerGlass));
        System.out.println(glassSet.add(wineglass));

        for(Glass itemGlass : glassSet){
            System.out.println(itemGlass + " ");
        }
        System.out.println("glassSet.size() = " + glassSet.size());
    }
}
