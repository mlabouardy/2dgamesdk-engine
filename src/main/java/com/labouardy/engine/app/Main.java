package com.labouardy.engine.app;

import com.labouardy.engine.base.Game;
import com.labouardy.engine.base.GameDefault;
import com.labouardy.engine.base.GameInfo;

public class Main {

	public static void main(String[] args) {
		GameInfo info=new GameInfo()
						  .setCols(35)
						  .setRows(15)
						  .setTitle("Town defense")
						  .setRendering_size(32)
						  .build();
		
		Game g=new GameDefault(info);
		g.start();
	}

}
