package com.ibm.fst.APIProject;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserAPI {
    
    
    
    @Test
    public void verifyCreateUserTest() {
        
        //request base uri
        RestAssured.baseURI = "https://reqres.in";
        
        
        //Request Object
        RequestSpecification httpRequest = RestAssured.given();
        
        
        //header
        //body
        //auth
        //parameter
        
        
//      {
//          "name": "morpheus",
//          "job": "leader"
//      }
        
        
        
        JSONObject requestBody = new JSONObject();
        
        requestBody.put("name", "Athar");
        requestBody.put("job", "sr.leader");
        
        
        System.out.println(requestBody.toJSONString());
        
        System.out.println("====================================");
        //RequestBody ---- httpRequest
        
        httpRequest.body(requestBody.toJSONString());
        
        
        //Header
        httpRequest.header("Content-Type", "application/json");
        
        
        
        //Response Object
        Response resp = httpRequest.request(Method.POST, "/api/users");             //send the request to server
        
        
        
        System.out.println(resp.getBody().asPrettyString());
        
        System.out.println("Status Code: " + resp.getStatusCode());
    }
    
    

}



