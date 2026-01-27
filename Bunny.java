public class Bunny {
        int x;  // Start-Position (Hase) M
        int y;

        int windowswidth = 800;   //Fensterbreite M 

        int bunnyWidth = 40;       // Grösse Hase M
        int bunnyHeight = 40;

        int speed = 6;  //horizontale Geschwindigkeit M

        boolean hidden = false;  //Hase ist nicht versteckt M

        double fallspeed = 0;           
        double gravitation = 0.8;

        int groundY;   //Bodenhöhe M

        public Bunny(int startX, int groundY, int windowswidth){      //M
            this.x = startX;
            this.groundY = groundY;
            this.y = groundY - bunnyHeight;
            this.windowswidth = windowswidth;
        }
        public void moveLeft(){
            x -= speed;
            if(x < 0){
                x = 0;
            }
        }
        public void moveRight(){
            x += speed;
            if(x > windowswidth - bunnyWidth){     //bunny kann sich aus dem Fenster nicht rausbewegen M
                x = windowswidth - bunnyWidth;
            }
        }
        public void Jump(){     //springen M
            if (isOnGround()){
                fallspeed = -15;
            }
        }
        public void applyPhysics(){   //Physik anwenden M
            fallspeed += gravitation;
            y += fallspeed;
        
            
            if ( y> groundY - bunnyHeight){
                y = groundY - bunnyHeight;    //M
                fallspeed = 0;
            }
        }
            
            public void draw(){  
                if (!hidden) {
                Draw.filledRect(x, y, bunnyWidth, bunnyHeight);
            }
        }
            private boolean isOnGround(){
                return y >= groundY - bunnyHeight; //M
            }
        
        
    public double getX() {return x;}           // Standort vom Hasen (S)
    public double getY() {return y;}
    public double getWidth() {return bunnyWidth;}         //Größe vom Hasen (S)
    public double getHeight() {return bunnyHeight;}

    public void setHidden(boolean hidden) {  //Hase versteckt oder nicht (S)
        this.hidden = hidden;
    }
    public boolean isHidden() { //S
         return hidden;}
    }

            
            

        
       
       
       
        




        


