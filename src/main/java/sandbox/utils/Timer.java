package sandbox.utils;

import java.util.concurrent.TimeUnit;

public class Timer {

	private final long startTime;

	private Timer() {
		startTime = System.nanoTime();
	}

	public void printElapsed() {
		System.out.println("Time elapsed: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime) + "ms");
	}

	public static Timer start() {
		return new Timer();
	}
}
