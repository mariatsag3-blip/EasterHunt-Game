import java.awt.event.KeyEvent;



public class EasterHunt {

    static final int width = 1000;
    static final int height = 800;

    public static void main(String[] args){

        Draw.init(1000, 800);         
        Draw.enableDoubleBuffering(true);   

        int groundY = height - 160; //Höhe des Bodens M
        double grassTopY = - 140;     // oberer Rand vom Gras M

        Eagle eagle = new Eagle(-50, 40, 60, 40); // Eagle Objekt erzeugt M

        Bunny bunny = new Bunny(width / 2, groundY, width); // Bunny Objekt erzeugt M

        while(true){
            Draw.clearScreen();
            if (Draw.isKeyDown(KeyEvent.VK_LEFT)){  //Taste Bewegung nach Links M
                bunny.moveLeft();
             }

            if (Draw.isKeyDown(KeyEvent.VK_RIGHT)){  //Taste Bewegung nach Rechts M
                bunny.moveRight();
            }
            if (Draw.isKeyDown(KeyEvent.VK_SPACE)){  //Taste Sprung M
                bunny.Jump();
            }
            bunny.applyPhysics();
            bunny.draw();
            eagle.draw();
            eagle.eaglemovement();
            
            Draw.syncToFrameRate();

        }


    }
    
}
