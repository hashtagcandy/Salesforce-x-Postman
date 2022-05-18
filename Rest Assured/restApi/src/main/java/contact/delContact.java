package task;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class delContact {
	
	
public static  String global_sys_id;





public static void main(String[] args) {



RestAssured.useRelaxedHTTPSValidation();



RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/contact";



RestAssured.authentication = RestAssured.oauth2("00D5g000007oRrU!AQkAQMBVrvqx0wfRcAuKfKmkpsMAeBPVxV.g19tUYibaX_fe2wALjMqjbOBtu6Yp8hojtUwEJHjvJibQZDhEW_Xx8kAyduHx");






Response response = RestAssured.given()

.contentType(ContentType.JSON)


.body("{\"FirstName\":\"Soumadeep\""
+ ",\"LastName\":\"Roydndsjnd\","
+ "\"Phone\":\"9647400223446\"}")
.post();


// global_sys_id = response.jsonPath().get("id");

global_sys_id = "asdsad";

response.prettyPrint();





}







}