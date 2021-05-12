public class Shark extends Fish {
    
    public Shark(int x, int y){
        super(x, y);
    }

    public boolean eat(Creature c){
        if(!(c instanceof Shark || c instanceof Plankton) && this.intersects(c)) return true;
        return false;
    }

    public void move(){
        
    }

}
