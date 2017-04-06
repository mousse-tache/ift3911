package Reservation;

public class Assigned extends ReservableState {

	@Override
	public void reserve(Reservable ctx) {
		System.out.println("Place already reserved");
	}

	@Override
	public void cancel(Reservable ctx) {
		ctx.setState(new Free());
	}
}