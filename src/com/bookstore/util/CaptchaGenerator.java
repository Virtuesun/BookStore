package com.bookstore.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CaptchaGenerator {
	private Random random = new Random();

	private String value;
	private BufferedImage image;

	private int height;
	private int width;

	public CaptchaGenerator(int height, int width) {
		this.height = height;
		this.width = width;
	}

	private Color getRandColor(int fColor, int bColor) {
		if (fColor > 255) {
			fColor = 255;
		}
		if (bColor > 255) {
			bColor = 255;
		}

		int r = fColor + random.nextInt(bColor - fColor);
		int g = fColor + random.nextInt(bColor - fColor);
		int b = fColor + random.nextInt(bColor - fColor);
		return new Color(r, g, b);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public void generate() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();

		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);

		g.setFont(new Font("Times New Roman", Font.PLAIN, 18));

		g.setColor(getRandColor(160, 200));

		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}

		value = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			value += rand;

			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(rand, 13 * i + 6, 16);
		}

		g.dispose();
	}
}
