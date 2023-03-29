package weatherAPI;

import org.testng.annotations.Test;

import utility.Constants;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class WeatherAPIWithStaticImport {
    
    
    
    
    @Test
    public void verifyCityWeather() {
        
        baseURI = "https://api.openweathermap.org";
        
        String apiKey = Constants.apiKey;
        String cityName = "delhi";
        
        given().
        
            //header
            //body
            //para
            //auth
        
//          param("q", cityName).
//          param("appid", apiKey).
            
            
            queryParam("q", cityName).
            queryParam("appid", apiKey).
                
        
        
        when().
            //action
            get("/data/2.5/weather").
        
        then().
            statusCode(200).
            header("Content-Type","application/json; charset=utf-8").
            header("Server","openresty").
            body("name", equalTo("Delhi")).
            log().all();
        
        
//      HTTP/1.1 200 OK
//      Server: openresty
//      Date: Thu, 23 Mar 2023 06:34:37 GMT
//      Content-Type: application/json; charset=utf-8
//      Content-Length: 458
//      Connection: keep-alive
//      X-Cache-Key: /data/2.5/weather?q=delhi
//      Access-Control-Allow-Origin: *
//      Access-Control-Allow-Credentials: true
//      Access-Control-Allow-Methods: GET, POST
            
        
    }

}



