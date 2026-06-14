import processing.core.PApplet;

public class Drop {

    // instance variables
    PApplet app; //reference to the sketch
    float x;
    float y;
    float yspeed;
    float z; //every drop like a "z" value
    float len;

    //constructor
    public Drop(PApplet app) {
        this.app = app;

        //random starting position
        x = app.random(app.width);
        y = app.random(-500, -50); 

        //depth for visual effect
        z = app.random(0, 20); 

        // set speed and length based on depth
        yspeed = app.map(z, 0, 20, 1, 20); //close = faster, far = slower
        len = app.map(z, 0, 20, 10, 20); // 0 is far, 20 is close
    }

    public void fall() {
        y = y + yspeed;
        float grav = app.map(z, 0, 20, 0, 0.2f); //f for float
        yspeed = yspeed + grav; //garvity effect

        if (y > app.height) {
            y = app.random(-200, -100);
            yspeed = app.random(4, 10); // reset speed
        }
    }

    public void show() {
        float thick = app.map(z, 0, 20, 1, 3);//thinkness based on depth
        app.strokeWeight(thick);
        app.stroke(217, 249, 248); //blue
        app.line(x, y, x, y + len); // drop line 

    }
}