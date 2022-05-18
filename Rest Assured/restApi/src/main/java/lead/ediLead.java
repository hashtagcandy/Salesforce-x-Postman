



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class ediLead {
	
	
public static  String global_sys_id;





public static void main(String[] args) {









RestAssured.useRelaxedHTTPSValidation();



RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/contact";



RestAssured.authentication = RestAssured.oauth2("00D5g000007oRrU!AQkAQLv76OiZAtwrCPwUlJKiBxWCi7bNowyuNExQtUAbdRqfcMFVs6agcX2D5j5YZYxosGPEnHnX3n.i8aD7AfOcQJ5xVw6w");






Response response = RestAssured.given()

.contentType(ContentType.JSON)


.body("{\"FirstName\":\"Soumadeep\""
+ ",\"LastName\":\"Roydndsjnd\",")
.patch();


// global_sys_id = response.jsonPath().get("id");

global_sys_id = "asdsad";

response.prettyPrint();





}







}