package Reservation;

public class Free extends ReservableState {

	@Override
	public void reserve(Reservable ctx, Reservation r) {
		ctx.setState(new Reserved(ctx, r));
	}

	@Override
	public void cancel(Reservable ctx) {
		System.out.println("Place already free");
	}

	@Override
	public boolean isAvailable() {
		return true;
	}
}