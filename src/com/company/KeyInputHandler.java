package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputHandler extends KeyAdapter {
	public KeyInputHandler() {
		System.out.println("Success");
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("Key Typed: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("Key Pressed: " + e.getKeyChar());
		if (e.getKeyChar() == 'w')
			GraphicsPane.moveZ(20);
		else if (e.getKeyChar() == 's')
			GraphicsPane.moveZ(-20);
		else if (e.getKeyChar() == 'a')
			GraphicsPane.moveX(-20);
		else if (e.getKeyChar() == 'd')
			GraphicsPane.moveX(20);

	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("Key Released: " + e.getKeyChar());
	}


}
