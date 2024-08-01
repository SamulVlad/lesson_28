package com.samul.javaсorelessons.lesson28.Task6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Runnable run = new Runnable() {

			@Override
			public void run() {
				Random rnd = new Random();
				int willSleep = rnd.nextInt(5000);
				System.out.println("Thread id : " + Thread.currentThread().getId() + " Will sleep: " + willSleep);

				for (int i = 1; i <= 5; i++) {

					System.out.println("Thread id : " + Thread.currentThread().getId() + "  Count: " + i);

					try {
						Thread.sleep(willSleep);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("Thread id : " + Thread.currentThread().getId() + " Thread done. ");

			}

		};

		Thread thr1 = new Thread(run);
		thr1.start();

		Thread thr2 = new Thread(run);
		thr2.start();

		Thread thr3 = new Thread(run);
		thr3.start();

	}

}
