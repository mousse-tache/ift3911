package Reservation;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Reserved extends ReservableState {

	private static long delay = TimeUnit.MILLISECONDS.toDays(1);
	private Timer timer;

	@Override
	public void reserve(Reservable ctx, Reservation r) {
		System.out.println("This place is already reserved");
	}

	@Override
	public void cancel(Reservable ctx) {
		ctx.setState(new Free());
	}

	@Override
	public boolean isAvailable() {
		return false;
	}

	Reserved(Reservable ctx, Reservation r){
		this.reservation = r;
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