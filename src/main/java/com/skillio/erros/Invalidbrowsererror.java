package com.skillio.erros;

public class Invalidbrowsererror extends Error{
	
private	String browseName;
     public Invalidbrowsererror(String browseName){
    	browseName= this.browseName;
	
}
     @Override
    	public String getMessage() {
    	 
    		return "Invalid browser name provided in testng.xml";
    	}

}
