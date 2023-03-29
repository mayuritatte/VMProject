package com.ibm.fst.APIProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class APITest {    
    
    @Test
    public void verifyListUserTest() {
        
        
        
        
        RestAssured.baseURI = "https://reqres.in";
        
        
        Response resp = RestAssured.given().request(Method.GET, "/api/users?page=2");               //send the request to server
        
        
        
        System.out.println(resp.getBody().asString());
        System.out.println("=============================");
        System.out.println(resp.getBody().asPrettyString());
        
        
        System.out.println("Status Code: " + resp.getStatusCode());                             //200
        
        Assert.assertEquals(resp.getStatusCode(), 200);
        
    }
    
    

}
