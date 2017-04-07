package Travel.Itineraries;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ItineraryForm;
import Utils.Searcher.Searcher;

public abstract class Itinerary {

	protected TravelType type;
	protected List<Stop> stops;
	protected String id;

	Itinerary(ItineraryForm form){
		this.id = form.getID();
		this.type = form.getType();

		List<String> locIDs = form.getLocationIDs();
		List<Time> times = form.getTimes();
		if (locIDs.size() != times.size())
			throw new IllegalArgumentException("Invalid form: Locations do not map perfectly to Times");
		this.stops = new ArrayList<Stop>();
		for (int i=0;i<times.size();i++){
			TravelFacility tf = Searcher.getTravelFacilityFromID(locIDs.get(i));
			if (tf == null){
				throw new IllegalArgumentException("Facility with ID=" + locIDs.get(i) + "can't be found");
			}
			if (i>0 && i<times.size()-1 && times.get(i).before(times.get(i+1))) {
				throw new IllegalArgumentException("Times for itineraries' stops must be ascendant");
			}
			stops.add(new Stop(tf,times.get(i)));
		}
	}

	public String getId() { return this.id; }

	public Stop getDeparture(){ return stops.get(0); }
	public Stop getArrival(){ return stops.get(stops.size()-1); }

	public TravelFacility getDepartureLocation(){ return stops.get(0).getLocation(); }
	public TravelFacility getArrivalLocation(){ return stops.get(stops.size()-1).getLocation(); }

	public Time getTripTime(){ return stops.get(stops.size()-1).getTimeFromDeparture();}

	public List<Stop> getStops(){return stops;}
}