package com.ibm.fst.APIProject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class GetAPITestWithGiven {
  
	    
	    @Test
	    public void verifyCityWeather() {
	        
	        baseURI = "https://reqres.in";

	        
	        given().
	        
	            //header
	            //body
	            //para
	            //auth
	      
	        
	        when().
	            //action
	            get("/api/users?page=2").
	        
	        then().
	            statusCode(200).
	            log().all();
	       

	}

}
