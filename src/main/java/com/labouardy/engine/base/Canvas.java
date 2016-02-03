package com.labouardy.engine.base;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import com.labouardy.engine.entity.Enemy;

public class Canvas extends JPanel{

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Enemy e=new Enemy(this);
		e.setPosition(new Point(0, 0));
		e.draw(g);
	}

}
