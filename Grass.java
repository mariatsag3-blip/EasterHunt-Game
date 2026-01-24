
public class Bunny {
    double x, y ,width ,height;
    boolean hidden;

    public double getX() {return x;}
    public double getY() {return y;}
    public double getWidth() {return width;}
    public double getHeight() {return height;}

    public void setHidden(boolean hidden) { this.hidden = hidden;
    public boolean isHidden() { return hidden;}
}



    // Grassfigur wird erzeugt (S)

public class Grass {
    double x, y, width, height;

    public Grass(double x, double y, double width, double height) {
        this.x = x; 
        this.y = y; 
        this.width = width; 
        this.height = height;   
    }


 // Prüft ob der Hase sich mit dem Grass überlappt (S)

   public boolean isBunnyHidden(Bunny bunny) {
        return bunny.getX() + bunny.getWidth() > x &&
               bunny.getX() < x + width &&
               bunny.getY() + bunny.getHeight() > y && 
               bunny.getY() < y + height;
    }

//Gibt an, wenn der Hase versteckt ist (S)

if (grass.isBunnyHidden(bunny)){
    bunny.setHidden(true);
} else {
    bunny.setHidden(false);
}