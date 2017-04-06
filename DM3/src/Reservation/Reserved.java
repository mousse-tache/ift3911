package Reservation;

import java.util.Timer;
import java.util.TimerTask;

public class Reserved extends ReservableState {

	private static long delay = 1000*60*60*24;
	private Timer timer;

	/**
	 * 
	 * @param ctx
	 */
	public void reserve(Reservable ctx) {
		System.out.println("This place is already reserved");
	}

	/**
	 * 
	 * @param ctx
	 */
	public void cancel(Reservable ctx) {
		ctx.setState(new Free());
	}

	Reserved(Reservable ctx){
		this.timer = new Timer();
		TimerTask task = new TimerTask(){
			@Override
			public void run(){
				Reserved.this.cancel(ctx);
			}
		};

		this.timer.schedule(task, delay);
	}
}