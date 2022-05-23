package stepDefinitionAPI;


import java.io.IOException;
import java.util.Scanner;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import cucumber.api.java.en.*;


public class ApiStepDefinition {
	CloseableHttpClient client;
	HttpGet httpget;
	
	@Given("^Load all the preconditions$")
	public void load_all_the_preconditions() throws ClientProtocolException, IOException{
		client = HttpClients.createDefault();
	}

	@When("^I hit the GET api endpoint for list users$")
	public void i_hit_the_GET_api_endpoint_for_list_users(){
		httpget = new HttpGet("https://reqres.in/api/users?page=1");
	}

	@Then("^All the user information should appear$")
	public void all_the_user_information_should_appear() throws ClientProtocolException, IOException{
		HttpResponse httpresponse = client.execute(httpget);
		Scanner sc = new Scanner(httpresponse.getEntity().getContent());
		//Printing the status line
	      System.out.println(httpresponse.getStatusLine());
	      while(sc.hasNext()) {
	         System.out.println(sc.nextLine());
	      }
      }

	@When("^I hit the POST api endpoint for create user$")
	public void i_hit_the_POST_api_endpoint_for_create_user(){


	}

	@Then("^New user should create$")
	public void new_user_should_create(){


	}

	@When("^I hit the PUT api endpoint for update user$")
	public void i_hit_the_PUT_api_endpoint_for_update_user(){


	}

	@Then("^User should be updated$")
	public void user_should_be_updated(){


	}

	@When("^I hit the PATCH api endpoint for update user$")
	public void i_hit_the_PATCH_api_endpoint_for_update_user(){


	}

	@When("^I hit the DELETE api endpoint for delete user$")
	public void i_hit_the_DELETE_api_endpoint_for_delete_user(){


	}

	@Then("^User should be deleted$")
	public void user_should_be_deleted(){


	}

}
