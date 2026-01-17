public class Eagle {

    int x= -50;
    int y = 40;
    int eaglewidth = 60;
    int eagleheightheight = 40;

    boolean active = false;     //Adler startet nicht aktiv M

    int speed = 3;  //horizontale Geschwindigkeit M

    public Eagle(int startX, int startY, int width, int height) {  //M
        this.x = startX;
        this.y = startY;
        this.eaglewidth = width;
        this.eagleheightheight = height;
    }

    public void draw() {
        Draw.filledRect(x, y, eaglewidth, eagleheightheight);  //Adler zeichnen M
    }

    public void eaglemovement(){   //Adler Bewegung und Wahrscheinlichkeit (x% pro Frame) M
        if(!active){

        if(Math.random() < 0.001){  //Wenn adler nicht aktiv ist, x% Chance das er wieder erscheint (~alle 16 sek.)M
            active = true;
            x = -eaglewidth;               //Adler startet wieder von links M
        }
       
        }
        else{
            x += speed;            //Wenn Adler aktiv ist, bewegt er sich nach rechts bis ans Ende vom Fenster M                           
            if(x > 1000){
            active= false;
            }
            
            }
            
        }
        }
    
    
