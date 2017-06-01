package com.firstWork;

import java.util.LinkedList;

public class Snake {
	private LinkedList<Node> body = new LinkedList<Node>();
	
	public boolean isNeighbor(Node a,Node b){
		return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()) == 1;
	}
	
	public Node eat(Node food,Direction direction){
		
		Node snakeHead = this.getHead();
		int headX = snakeHead.getX();
		int headY = snakeHead.getY();
		
		int foodX = food.getX();
		int foodY = food.getY();
		
		switch(direction){
		case UP:
			if(((headY - 1) == foodY) && (headX == foodX)){
				this.body.addFirst(food);
				
			}else{
				return null;
			}
			break;
		case RIGHT:
			if(((headX + 1) == foodX) && (headY == foodY)){
				this.body.addFirst(food);
			}else{
				return null;
			}
			break;
		case DOWN:
			if(((headY + 1) == foodY) && (headX == foodX)){
				this.body.addFirst(food);
			}else{
				return null;
			}
			break;
		case LEFT:
			if(((headX - 1) == foodX) && (headY == foodY)){
				this.body.addFirst(food);
			}else{
				return null;
			}
			break;
		default:
			try {
				throw new Exception("δ֪����");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return food;
	}
	
	public Node move(Direction direction){
		
		Node head = this.getHead();
		int headX = head.getX();
		int headY = head.getY();
		Node newHead = null;
		switch(direction){
		case UP:
			newHead = new Node(headX,headY-1);
			break;
		case RIGHT:
			newHead = new Node(headX+1,headY);
			break;
		case DOWN:
			newHead = new Node(headX,headY+1);
			break;
		case LEFT:
			newHead = new Node(headX-1,headY);
			break;
		default:
			try {
				throw new Exception("δ֪����");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.body.addFirst(newHead);
		Node oldTail = this.body.removeLast();
		System.out.println(this.body.size());
		return oldTail;
		
	}
	
	public Node getHead(){
		return body.getFirst();
	}
	
	public Node addTail(Node node){
		this.body.addLast(node);
		return node;
	}
	
	public LinkedList<Node> getBody(){
		return body;
	}
	
	
	
}