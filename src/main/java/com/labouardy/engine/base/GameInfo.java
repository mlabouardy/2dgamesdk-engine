package com.labouardy.engine.base;

public class GameInfo {
	private String title;
	private int rows;
	private int cols;
	private int rendering_size;
	
	public GameInfo(){}
	
	public GameInfo(String title, int rows, int cols, int rendering_size) {
		this.title = title;
		this.rows = rows;
		this.cols = cols;
		this.rendering_size = rendering_size;
	}
	
	public int getWidth(){
		return cols*rendering_size;
	}
	
	public int getHeight(){
		return rows*rendering_size;
	}
	
	public String getTitle() {
		return title;
	}



	public int getRows() {
		return rows;
	}



	public int getCols() {
		return cols;
	}



	public int getRendering_size() {
		return rendering_size;
	}



	public GameInfo setTitle(String title) {
		this.title = title;
		return this;
	}

	public GameInfo setRows(int rows) {
		this.rows = rows;
		return this;
	}

	public GameInfo setCols(int cols) {
		this.cols = cols;
		return this;
	}

	public GameInfo setRendering_size(int rendering_size) {
		this.rendering_size = rendering_size;
		return this;
	}

	public GameInfo build(){
		return new GameInfo(title, rows, cols, rendering_size);
	}
	

}
