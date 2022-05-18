package contact;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class CreateContact {
	
	
public static  String global_sys_id;





public static void main(String[] args) {




//we have to add this only in the case of validational errors





//we have to add this only in the case of validational errors
RestAssured.useRelaxedHTTPSValidation();



//CLassName obj = new ClassName();



//Mandatory code to Get request
// we need to set our end point// server + port + resources
RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/contact";



//we nee to give our authentication
RestAssured.authentication = RestAssured.oauth2("00D5g000007oRrU!AQkAQLv76OiZAtwrCPwUlJKiBxWCi7bNowyuNExQtUAbdRqfcMFVs6agcX2D5j5YZYxosGPEnHnX3n.i8aD7AfOcQJ5xVw6w");



//im going to hit the send request with my GET request type



Response response = RestAssured.given()

.contentType(ContentType.JSON)// mandatory for both post and put


.body("{\"FirstName\":\"Soumadeep\""
+ ",\"LastName\":\"Roydndsjnd\","
+ "\"Phone\":\"9647400223446\"}")
.post();


// global_sys_id = response.jsonPath().get("id");

global_sys_id = "asdsad";

response.prettyPrint();





}







}