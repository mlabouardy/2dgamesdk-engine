package com.labouardy.engine.base;

import javax.swing.JFrame;

public class GameDefault implements Game{
	private JFrame frame;
	private Canvas canvas;
	private GameInfo gameInfo;
	
	public GameDefault(GameInfo gameInfo){
		this.gameInfo=gameInfo;
	}
	
	public void createGUI(){
		frame=new JFrame(gameInfo.getTitle());
		frame.setSize(gameInfo.getWidth(), gameInfo.getHeight());
		
		canvas=new Canvas();
		frame.add(canvas);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void start() {
		createGUI();
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}
}
