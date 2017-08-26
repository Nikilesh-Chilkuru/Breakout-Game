package com.breakout.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class GameBrick {
	public int brickArray[][];
	public int brickHeight;
	public int brickWidth;
	
	public GameBrick(int rows, int columns){
		brickHeight = 40;
		brickWidth = 80;
		brickArray = new int[rows][columns];
		
		for(int i = 0; i<brickArray.length;++i){
			for(int j = 0;j<brickArray[0].length;++j){
				brickArray[i][j] = 1;
			}
		}
	}
	
	public void drawBrick(Graphics2D g){
		for(int i =0; i<brickArray.length;++i){
			for(int j = 0; j<brickArray[0].length;++j){
				if(brickArray[i][j]>0){
					g.setColor(Color.WHITE);
					g.fillRect(j*brickWidth+60, i*brickHeight+40, brickWidth, brickHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.BLACK);
					g.drawRect(j*brickWidth+60, i*brickHeight+40, brickWidth, brickHeight);
				}
			}
		}
	}
	
	public void setBrickValue(int value, int row, int column){
		brickArray[row][column] = value;
	}
}