/**
 * PatternType: Behavioral
 *
 * 用于顺序访问集合对象中的元素, 而无需知道集合对象的底层表示
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
