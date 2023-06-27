import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    double initialSpeed = 3.5; // Change this number to increase the speed of the ball

    public Ball(int x, int y, int width, int height) {
        /*
        super(x, y, width, height);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
            setXDirection(randomXDirection);
        }
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) {
            randomYDirection--;
            setYDirection(randomYDirection);
        }
        */
        super(x, y, width, height);
        random = new Random();

        int randomXDirection = random.nextInt(2) == 0 ? -1 : 1;
        int randomYDirection = random.nextInt(2) == 0 ? -1 : 1;

        setXDirection((int) (randomXDirection * initialSpeed));
        setYDirection((int) (randomYDirection * initialSpeed));
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        // g.fillOval(x, y, width, height);
        g.fillRect(x, y, width, height);
    }

}