package org.pages;

public class AdactinPageManager {
	
	private AdactinLogin login;
	
	private AdactinSearchHotel searchHotel;
	
	public AdactinLogin getAdactinLogin() {
		
		if(login==null) {
			login = new AdactinLogin();
		}	
		return login;
	}
	
	public AdactinSearchHotel getAdactinSearchHotel() {	
		if(searchHotel==null) {
			searchHotel=new AdactinSearchHotel();
		}
		return searchHotel;	
	}
}
