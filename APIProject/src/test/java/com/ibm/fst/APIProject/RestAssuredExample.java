package com.ibm.fst.APIProject;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RestAssuredExample {

	Response resp;

	@BeforeTest
	public void setup() {




		RestAssured.baseURI = "https://reqres.in";


		resp = RestAssured.given().request(Method.GET, "/api/users?page=2");                //send the request to server



		System.out.println(resp.getBody().asString());
		System.out.println("=============================");
		System.out.println(resp.getBody().asPrettyString());


		System.out.println("Status Code: " + resp.getStatusCode());                             //200

		System.out.println("Content type, directMethod: " +resp.getContentType());                                              //application/json; charset=utf-8


		//headers
		System.out.println("Transfer-Encoding Value: " +resp.getHeader("Transfer-Encoding"));       //chunked                       
		System.out.println("Content-Type Value: " +resp.getHeader("Content-Type"));
		System.out.println("X-Powered-By Value: " +resp.getHeader("X-Powered-By"));


		//StatusLine
		System.out.println("StatusLine: " + resp.getStatusLine());

		//ResponseTime
		System.out.println("ResponseTime: " +resp.getTime());



	}


	//  Status Code: 200
	//  Content type, directMethod: application/json; charset=utf-8
	//  Transfer-Encoding Value: chunked
	//  Content-Type Value: application/json; charset=utf-8
	//  X-Powered-By Value: Express
	//  StatusLine: HTTP/1.1 200 OK
	//  ResponseTime: 1472





	@Test
	public void verifyStatusCode() {

		Assert.assertEquals(resp.getStatusCode(), 200);

	}

	@Test
	public void verifyStatusLine() {

		Assert.assertEquals(resp.getStatusLine(), "HTTP/1.1 200 OK");
	}

	@Test
	public void verifyContentType() {

		Assert.assertEquals(resp.getContentType(), "application/json; charset=utf-8", "Verification of Content Type get failed.");
		Assert.assertTrue(resp.getContentType().contains("json"));

	}

}

