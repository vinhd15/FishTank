
public class Fish extends Creature{
    
    public Fish(int x, int y){
        super(x,y);
        label = "Fish";
    }

    @Override
    public void move() {
        
        
    }

    @Override
    public boolean eat(Creature c) {
        return false;
    }



}