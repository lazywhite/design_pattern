public class Computer implements ComputerPart {
    private ComputerPart[] parts ;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
        for(int i = 0;i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
    }
}
