package com.labouardy.engine.base;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.text.Position;

public class Sprite{
	private Image image;
	private Point position;
	private Canvas canvas;
	
	public Sprite(Canvas canvas, String path){
		this.canvas=canvas;
		try {
			image=ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setPosition(Point position){
		this.position=position;
	}
	
	public Point getPosition(){
		return this.position;
	}

	public void draw(Graphics g){
		g.drawImage(image, (int)position.getX(), (int)position.getY(), canvas);
	}

}
