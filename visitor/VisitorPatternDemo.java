/**
 * Type: Behavioral
 * As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.
 */
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
