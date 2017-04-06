package Reservation;

public class Free extends ReservableState {

	@Override
	public void reserve(Reservable ctx) {
		ctx.setState(new Reserved(ctx));
	}

	@Override
	public void cancel(Reservable ctx) {
		System.out.println("Place already free");
	}
}