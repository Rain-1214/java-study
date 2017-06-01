package com.firstWork;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class SnakeApp {
	
	public void init() {
		
		Grid grid = new Grid(20,30);
		
        //������Ϸ����
        JFrame window = new JFrame("game");
        
        
        GameView gameView = new GameView(grid);
        GameController gameController = new GameController(grid,gameView);
        window.addKeyListener(gameController);
        Container contentPane = window.getContentPane();
        
        // ����Grid��ʼ��gamaView
        
        gameView.init();
        
        // ����gameView��JPanel�Ĵ�С
        gameView.getCanvas().setPreferredSize(new Dimension(500,500));   
        // ��gameView��JPanel���뵽������
        contentPane.add(gameView.getCanvas(), BorderLayout.CENTER);
        // �������̺�̰����
        

        window.pack();
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        new Thread(gameController).start();
    }

	
    public static void main(String[] args) {
        SnakeApp snakeApp = new SnakeApp();
        snakeApp.init();
    }
    
    
}