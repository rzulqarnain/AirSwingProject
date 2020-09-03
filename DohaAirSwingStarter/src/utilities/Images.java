package utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static javax.imageio.ImageIO.read;

public class Images {

    public static BufferedImage readFromFile(String filename) {
        BufferedImage image = null;
        try {
            image = read(new File(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }

    private Images() {
    }
}
