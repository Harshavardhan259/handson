package com.demo.threads;

public class LongService {
	public void call() {
		LongProcess longProcess = new LongProcess();

		longProcess.runLong();

	}
}
