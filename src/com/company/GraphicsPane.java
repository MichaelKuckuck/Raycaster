package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class GraphicsPane extends JPanel implements ActionListener {
	private static final int REFRESH_DELAY = 200; // in ms
	int pos = 2;
	int incPos = 20;
	private Object RedWall;

	public GraphicsPane() {
		initPanel();

	}

	private void initPanel() {
		this.setFocusable(true);
		this.addKeyListener(new KeyInputHandler());

		RedWall = new Object(0,0,200,200, Color.black);

		Timer timer = new Timer(REFRESH_DELAY, this);
		timer.start();
	}

	public void moveZ(int dist) {

		RedWall.setPosX(dist);
		RedWall.setPosY(dist);
		RedWall.setWidth(-2*dist);
		RedWall.setHeight(-2*dist);
	}

	public void moveX(int dist) {
		oX += dist;
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g2d);

//		ellipseTest(g2d);
		drawObject(g2d, RedWall);


	}

	private void drawObject(Graphics2D g2d, Object object) {
		g2d.setColor(object.getColor());
		g2d.fillRect(object.getPosX(),object.getPosY(),object.getWidth(),object.getHeight());
	}

	private void ellipseTest(Graphics2D g2d) {
		Ellipse2D test = new Ellipse2D.Double(pos, pos,getWidth() - 2*pos, getHeight() - 2*pos);
		g2d.setStroke(new BasicStroke());
		g2d.setColor(Color.green);
		g2d.fill(test);

		if(pos >= getWidth()/3 || pos >= getHeight()/3 || pos <= 1)
			incPos *= -1;
		pos += incPos;
//		System.out.println(pos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}

