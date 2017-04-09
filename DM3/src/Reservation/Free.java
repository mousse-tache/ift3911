package Reservation;

public class Free extends ReservableState {

	@Override
	public void reserve(Reservable ctx, Reservation r) {
		ctx.setState(new Reserved(ctx, r));
	}

	@Override
	public void cancel(Reservable ctx) {
		throw new IllegalStateException("Place already free");
	}

	@Override
	public boolean isAvailable() {
		return true;
	}
}