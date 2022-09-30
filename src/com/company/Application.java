package com.company;

import javax.swing.JFrame;

public class Application extends JFrame {

	public Application() {
		this.add(new GraphicsPane());


		this.setSize(400,300);
		this.setTitle("Basic Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Application App = new Application();


	}

}