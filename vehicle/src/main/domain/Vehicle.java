package vehicle.src.main.domain;

public class Vehicle extends Dealers{
		
	 private String _id;
	 private String _model;
	 private String _fuel;
	 private String _transmission;
	 private Hash _availability; //????????????
	
	 public Vehicle(String id, String model, String fuel, String transmission){

		    _id = id;
		    _model = model;
		    _fuel = fuel;
		    _tramsmission = transmission;
	}
	 
}