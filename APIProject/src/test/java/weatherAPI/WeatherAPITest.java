package weatherAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class WeatherAPITest {
	    
	    @Test
	    public void verifyCityWeather() {
	        
	        baseURI = "https://api.openweathermap.org";
	       
	        
	        given().
	        
	            //header
	            //body
	            //para
	            //auth
	       
	        
	        when().
	            //action
	            get("/data/2.5/weather?q=delhi&appid=c76e6d1f2e6af75573c66176b1ad5627").
	        
	        then().
	            statusCode(200).
	            log().all();

	}

}
