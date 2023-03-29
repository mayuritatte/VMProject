package gitHubAPI;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.Constants;

public class Post_CreateGitHUbRepo {
    
    
    
    @Test
    public void verifyCreateUserTest() {
        
        
        //https://api.github.com/user/repos
        //request base uri
        RestAssured.baseURI = "https://api.github.com";
        
        
        //Request Object
        RequestSpecification httpRequest = RestAssured.given();
        
        
        //header
        //body
        //auth
        //parameter
        
        
        //auth
        //httpRequest.auth().oauth2(Constants.gitHubToken);
        httpRequest.auth().oauth2("");
        
//      {
//          "name": "morpheus",
//          "job": "leader"
//      }
        
        
        
        JSONObject requestBody = new JSONObject();
        
        requestBody.put("name", "GitHUbRepo_RestAssured");
        
        
        
        System.out.println(requestBody.toJSONString());
        
        System.out.println("====================================");
        //RequestBody ---- httpRequest
        
        httpRequest.body(requestBody.toJSONString());
        
        
        //Header
        httpRequest.header("Content-Type", "application/json");
        
        
        
        
        
        //sending a request to server
        
        //Response Object
        Response resp = httpRequest.request(Method.POST, "/user/repos");                //send the request to server
        
        
        
        System.out.println(resp.getBody().asPrettyString());
        
        System.out.println("Status Code: " + resp.getStatusCode());
    }
    
    

}


