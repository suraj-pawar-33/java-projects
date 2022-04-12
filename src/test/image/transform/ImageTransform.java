package test.image.transform;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImageTransform {

	private BufferedImage originalImage;

	public ImageTransform(BufferedImage image) {
		originalImage = image;
	}
	
	/**
	 * Returns image with the size 64 *64
	 * @return
	 */
	public BufferedImage getAppIcon() {
		int width = 64;
        int height = 64;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int extWidth = Math.floorDiv(originalImage.getWidth(), width);
        int extHeight = Math.floorDiv(originalImage.getWidth(), width);
        for (int y = 0; y < height; y++) {
             for (int x = 0; x < width; x++) {
                  int p = originalImage.getRGB(x * extWidth,y * extHeight);
                  image.setRGB(x, y, p);
              }
          }
		return image;
	}
	
	/**
	 * Reduces the size in percentages
	 * @param percent 0 to 100
	 * @return
	 */
	public BufferedImage getResizedImage(int percent) {
		if (percent > 100 || percent < 0) {
			return originalImage;
		}
		int width = originalImage.getWidth() * percent/100;
        int height = originalImage.getHeight() * percent/100;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int extWidth = Math.floorDiv(originalImage.getWidth(), width);
        int extHeight = Math.floorDiv(originalImage.getWidth(), width);
        for (int y = 0; y < height; y++) {
             for (int x = 0; x < width; x++) {
                  int p = originalImage.getRGB(x * extWidth,y * extHeight);
                  image.setRGB(x, y, p);
              }
          }
		return image;
	}
	
	public BufferedImage getBlackWhite() {
		int width = originalImage.getWidth();
        int height = originalImage.getHeight();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < height; y++) {
             for (int x = 0; x < width; x++) {
                  int p = originalImage.getRGB(x, y);
                  Color c = new Color(p);
                  int r = c.getRed();
                  int b = c.getBlue();
                  int g = c.getGreen();
                  if (r > 112) r = 225;
                  else  r = 0;
                  
                  if (g > 112) g = 225;
                  else  g = 0;
                  
                  if (b > 112) b = 225;
                  else  b = 0;

                  int avg = Math.floorDiv(r+g+b, 3);
                  Color c1 = new Color(avg, avg, avg);
                  image.setRGB(x, y, c1.getRGB()); 
              }
          }
		return image;
	}
}
