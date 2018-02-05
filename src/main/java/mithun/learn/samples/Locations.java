package mithun.learn.samples;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Entity
@Table(name="LOCATIONS")
public class Locations implements Serializable{
	@Column(name="location_id",unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int locationId;
	@Column(name="street_address")
	private String streetAddress;
	@Column(name="postal_code")
	private String postalCode;
	@Column(name="city")
	private String city;
	@Column(name="state_province")
	private String stateProvince;
	@Column(name="Country_ID")
	private int countryId;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
	
}
