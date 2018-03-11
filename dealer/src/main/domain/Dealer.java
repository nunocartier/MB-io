package dealer.src.main.domain;

import java.math.*;
import java.util.List;
import java.util.ArrayList;

public class Dealer extends Root{ //in root there is a list of dealers

  private String _id;
  private String _name;
  private float _latitude;
  private float _longitude;

  private List<Vehicles> _vehicles = new ArrayList<Vehicles>();
  private List<Availability> _closed = new ArrayList<Availability>();

  public Dealer(String id, String name, float latitude, float longitude){

    _id = id;
    _name = name;
    _latitude = latitude;
    _longitude = longitude;

  }
  
  public float getLatitude(){
	  
	  return _latitude;
  }
  
  public void setLatitude(float latitude){
	  
	  _latitude = latitude;
  }
  
  public float getLongitude(){
	  
	  return _longitude;
  }
  
  public void setLongitude(float longitude){
	  
	  _longitude = longitude;
  }
  
  public String getId(){
	  
	  return _id;
  }
  
  public void setId(String id){
	  
	  _id = id;	  
  }
  
  public String getName(){
	  
	  return _name;
  }
  
  public void setName(String name){
	  
	  _name = name;	  
  }

  public Dealer findDealer(float latitude, float longitude, String model, String fuel, String transmission){

    float myLocation = Math.sqrt((latitude*latitude) + (longitude*longitude));
    float closestDealer = 202; //NAO ESTOU A TRATAR DOS NEGATIVOS
    List<Dealer> _closestDealers = new ArrayList<>();

    //compose a list of the closest dealers to my location
    for(Dealer d1 : _dealers){

      d1Lat = d1.getLatitude();
      d1Long = d1.getLongitude();
      float dealerLocation = Math.sqrt((d1Lat*d1Lat) + (d1Long*d1Long));

      if(dealerLocation - myLocation < closestDealer)
        closestDealer = dealerLocation - myLocation;
        _closestDealers.add(d1);
    }

    //search the list backwards to find the vehicle with the requested attributes
    for(int i = _closestDealer.size() - 1 ; i >= 0 ; i--){

      for(Vehicles v1 : _closestDealers[i].getVehicles(i.getId())){

        if(v1.getModel().equals(model) && v1.getfuel().equals(fuel) && v1.getTransmission().equals(transmission))
          return _closestDealers[i];

      }
    }

    return "No dealers with the requested vehicle attributes";
  }
  
  public List<Vehicle> getVehicles(String id){
	  for(Dealer d2 : _dealers){
		  if(id.equals(d2.getId))
			  return _vehicles;
	  }
  }    
  
}
