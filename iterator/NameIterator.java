public class NameIterator implements Iterator {
    int index;
    @Override
    public boolean hasNext(){
        if(index < names.length){
            return true;
        }
        return false
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}

