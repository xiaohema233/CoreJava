package v1ch02.ImageViewer;

import javax.swing.*;
import java.awt.*;

/**
 * A program for viewing images.
 *
 * @author Cay Horstmann
 * @version 1.31 2018-04-10
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ImageViewerFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


