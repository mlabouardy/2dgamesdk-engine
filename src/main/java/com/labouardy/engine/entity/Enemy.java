package com.labouardy.engine.entity;

import com.labouardy.engine.base.Canvas;
import com.labouardy.engine.base.Sprite;

public class Enemy extends Sprite{
	private final static String PATH="sprites/enemy.png";
	
	public Enemy(Canvas canvas) {
		super(canvas, PATH);
	}

}
