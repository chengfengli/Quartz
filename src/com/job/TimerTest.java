package com.job;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest extends TimerTask {

	private Timer timer;

	public static void main(String[] args) {
		TimerTest timerTest = new TimerTest();
		timerTest.timer = new Timer();
		// 立刻开始执行timerTest任务，只执行一次
		//timerTest.timer.schedule(timerTest, new Date());
		
		//立刻开始执行timerTest任务，执行完本次任务后，隔2秒再执行一次  
		timerTest.timer.schedule(timerTest,new Date(),2000);
	}

	@Override
	public void run() {
		System.out.println("Task is running!");
	}

}
