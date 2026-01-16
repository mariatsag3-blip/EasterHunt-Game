public class Bunny {
        int x;  // Start-Position (Hase) M
        int y;

        int bunnyWidth = 40;       // Grösse Hase M
        int bunnyHeight = 40;

        int speed = 6;  //horizontale Geschwindigkeit M

        double fallspeed = 0;           
        double gravitation = 0.8;

        int groundY;   //Bodenhöhe M

        public Bunny(int startX, int groundY){      //M
            this.x = startX;
            this.groundY = groundY;
            this.y = groundY - bunnyHeight;
        }
        public void moveLeft(){
            x -= speed;
        }
        public void moveRight(){
            x += speed;
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
            public void draw(){                                 //Provisorische Zeichnung des Hasen
                Draw.filledRect(x, y, bunnyWidth, bunnyHeight);
            }
            private boolean isOnGround(){
                return y >= groundY - bunnyHeight; //M
            }
            } 
       
       
       
        




        


