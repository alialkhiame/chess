package oop;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImagesSizeEdit {
	private static ImageIcon[] s = new ImageIcon[25];

	public static void main(String[] args) {
		s[1] = new ImageIcon("wRook.png");
		s[2] = new ImageIcon("wRookClicked.png");
		s[3] = new ImageIcon("bRook.png");
		s[4] = new ImageIcon("bRookClicked.png");

		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			resizeTheImages(s[i]);
		}
	}

	public static void resizeTheImages(ImageIcon x) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(x.getDescription()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(1400 / 8, 1400 / 8, Image.SCALE_SMOOTH);
		try {
			ImageIO.write(toBufferedImage(dimg), "PNG",
					new File("C:\\Users\\alial\\OneDrive\\Desktop\\workspace\\oop\\" + x.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		x.setImage(dimg);
	}

	private static BufferedImage toBufferedImage(Image img) {
		if (img instanceof BufferedImage) {
			return (BufferedImage) img;
		}
		BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		bimage.getGraphics().drawImage(img, 0, 0, null);
		return bimage;
	}
}
