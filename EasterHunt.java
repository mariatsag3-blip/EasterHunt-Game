import java.awt.event.KeyEvent;



public class EasterHunt {

    static final int width = 1000;
    static final int height = 800;
    static Bunny bunny;
    static Eagle eagle;
    static Grass grass;
    static boolean gameover = false;

    public static void main(String[] args){

        Draw.init(1000, 800);         
        Draw.enableDoubleBuffering(true);   

        int groundY = height - 160; //Höhe des Bodens M
        double grassTopY = - 140;     // oberer Rand vom Gras M

        eagle = new Eagle(-50, 40, 60, 40); // Eagle Objekt erzeugt M

        bunny = new Bunny(width / 2, groundY, width); // Bunny Objekt erzeugt M

        grass = new Grass(200, groundY, 200, 40); //Grass Objekt erzeugt (S)

        while(true){
            
            if(!gameover){ //Solange kein Game Over ist M
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
            //Gibt an, wenn der Hase versteckt ist (S)

            if (grass.isBunnyHidden(bunny)){
                bunny.setHidden(true);
            } else {
                bunny.setHidden(false);
           }
            bunny.applyPhysics();
            bunny.draw();
            eagle.draw();
            eagle.eaglemovement();
            gameOver();
        }
        else{                    //Wenn Game Over ist M
            Draw.clearScreen();
            Draw.setColor(0, 0, 0); //Schwarzer Hintergrund M
            Draw.filledRect(0, 0, width, height);
            Draw.setColor(255, 0, 0); //Roter Text M
            Draw.text(width / 2 , height / 2 + 30, "GAME OVER"); //Game Over Text M
            Draw.text(width / 2, height / 2 - 30, "Press R to restart");
            if ( Draw.isKeyDown(KeyEvent.VK_R)){  //R Taste zum Neustarten M
                gameover = false;
                bunny = new Bunny(width / 2, groundY, width); // Neues Bunny Objekt erzeugt M
                eagle = new Eagle(-50, 40, 60, 40); // Neues Eagle Objekt erzeugt M
            }
        }

            Draw.syncToFrameRate();
        }
    }
            static void gameOver(){
                if(Math.abs(eagle.x- bunny.x) < 30){   //Wenn der Abstand zwischen Adler und Hase kleiner als 30 ist M
                    System.out.println("Game Over");
                    gameover = true;
                }
            }
            
            

        }


    
    

