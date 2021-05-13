public class Plankton extends Creature {
    
    public Plankton(int x, int y){
        super(x, y);
        dir = 1;
    }

    public boolean eat(Creature c){
        return false;
    }
    
    public void move(){
        PlanktonMoveThread thread = new PlanktonMoveThread();
        thread.start();
    }

    class PlanktonMoveThread extends Thread{
        public volatile int count;
        public void run(){
            while(count < 10 && getX() < getWidth() && getY() < getHeight()){
                try{
                    Thread.sleep(20);
                    setLocation(getX(), getY()+(10*dir));
                    repaint();
                    count++;
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
