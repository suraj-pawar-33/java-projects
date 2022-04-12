package test.image.transform;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Executor {
public static void main(String[] args) {
	ImageTransform imageTransform;
	try {
		imageTransform = new ImageTransform(ImageIO.read(new File("C://Users//onkar//Pictures//1587659899005.jpg")));
		ImageIO.write(imageTransform.getAppIcon(), "png", new File("C://Users//onkar//Pictures//appIcon.png"));
		ImageIO.write(imageTransform.getResizedImage(50), "jpg", new File("C://Users//onkar//Pictures//resized50.jpg"));
		ImageIO.write(imageTransform.getBlackWhite(), "jpg", new File("C://Users//onkar//Pictures//BW.jpg"));
	} catch (IOException e) {
		System.err.println(e.getLocalizedMessage());
//		e.printStackTrace();
	}
}
}
