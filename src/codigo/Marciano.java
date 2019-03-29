
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jorge Cisneros
 */
public class Marciano {
    public Image imagen1, imagen2 = null;
    private int x = 0;
    public int y = 0;
    public int vX = 1;
    public boolean vivo = true;
    
    public Marciano(){

    }
    
    public void mueve(){
        x += vX;
    }

    public void setvX(int vX) {
        this.vX = vX;
    }

    public int getvX() {
        return vX;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
