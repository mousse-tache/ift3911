package Reservation;

public class Assigned extends ReservableState {

	@Override
	public void reserve(Reservable ctx, Reservation r) {
		throw new IllegalStateException("Place already reserved");
	}

	@Override
	public void cancel(Reservable ctx) {
		ctx.setState(new Free());
	}

	@Override
	public boolean isAvailable() {
		return false;
	}
}