package com.thread;

import javax.swing.text.AsyncBoxView;

public class Thread2 implements Runnable{
	
	private int baoZi;
	private String ThreadName;
	public Thread2(int baoZi, String threadName) {
		super();
		this.baoZi = baoZi;
		ThreadName = threadName;
	}
	@Override
	public synchronized void run() {
		while(baoZi < 10){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName() + this.ThreadName + "�Ե�" + this.baoZi);
			this.baoZi++;
		}
	}
	
	public static void main(String[] args) {
//		Thread2 a = new Thread2(0,"����");
//		Thread2 b = new Thread2(0,"����");
//		
//		Thread a1 = new Thread(a);
//		Thread a2 = new Thread(b);
//		
//		a1.start();
//		a2.start();
		
//		Thread2 c = new Thread2(0,"�����߳�");
//		Thread c1 = new Thread(c);
//		Thread c2 = new Thread(c);
//		Thread c3 = new Thread(c);
//		
//		c1.start();
//		c2.start();
//		c3.start();
		
		Thread2 a = new Thread2(0,"����");
		
		Thread a1 = new Thread(a,"һ");
		Thread a2 = new Thread(a,"��");
		
		a1.start();
		a2.start();
		
	}
	

}