package contact;




import io.restassured.RestAssured;
import io.restassured.response.Response;



public class getcontact {



public static void main(String[] args) {
	
RestAssured.useRelaxedHTTPSValidation();



RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/contact";

RestAssured.authentication = RestAssured.oauth2("00D5g000007oRrU!AQkAQMBVrvqx0wfRcAuKfKmkpsMAeBPVxV.g19tUYibaX_fe2wALjMqjbOBtu6Yp8hojtUwEJHjvJibQZDhEW_Xx8kAyduHx");


Response response = RestAssured.given().get();


response.prettyPrint();





}



}

