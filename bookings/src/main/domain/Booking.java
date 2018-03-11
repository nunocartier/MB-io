package booking.src.main.domain;

public class Booking extends Root{
	
	private String _id;
	private String _vehicleId;
	private String _firstName;
	private String _lastName;
	private Datetime _pickupDate;
	private Datetime _createdAt;
	private Datetime _cancelledAt;
	private Text _cancelledReason;
	
	public Booking(String id, String vehicleId, String firstName, String lastName, Datetime pickupDate, Datetime createdAt, Datetime cancelledAt, Text cancelledReason){

		_id = id;
		_vehicleId = vehicleId;
		_firstName = firstName;
		_lastName = lastName;
		_pickupDate = pickupDate;
		_createdAt = createdAt;
		_cancelledAt = cancelledAt;
		_cancelledReason = cancelledReason;
		
	}