//Ganuary 11
//rain-rain
import processing.core.PApplet;

public class Sketch extends PApplet {

    Drop[] drops = new Drop[500]; // 500 drops

    public void settings() {
        size(600, 600);
        
    }

    public void setup() {
        background(20);
        for(int i = 0; i < drops.length; i++) {
           drops[i] = new Drop(this);
        }
    }

    public void draw() {
        background(200); //helps droping like rain, not like river
        for(int i = 0; i < drops.length; i++) {
           drops[i].show();
           drops[i].fall();
        }
    }

}