package com.company;

import java.awt.*;

public class Object {
	private int posX;
	private int posY;
	private int width;
	private int height;
	private Color color;

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX += posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY += posY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width += width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height += height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Object(int posX, int posY, int width, int height, Color color) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void moveForward() {

	}

}
