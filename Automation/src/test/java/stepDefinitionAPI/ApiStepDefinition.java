package stepDefinitionAPI;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ApiStepDefinition {
	OkHttpClient client;     
	Request request;
	Response httpresponse;
	String response_content;
	Integer response_code;
	String url,method;
	MediaType mediaType;
	
	@Given("^Load all the preconditions$")
	public void load_all_the_preconditions() throws IOException{
		 client = new OkHttpClient();
		 mediaType = MediaType.parse("application/json");
	}

	@When("^I hit the GET api endpoint \"([^\"]*)\"$")
	public void i_hit_the_GET_api_endpoint(String url){
		this.url = url;
		method = "GET";
	}

	@Then("^All the user information should appear$")
	public void all_the_user_information_should_appear() throws IOException{
		request = new Request.Builder()
		        .url(url)
		        .method(method, null) 
		        .build();
		List<Object> resp = execute_request();
		assert (Integer)resp.get(0) == 200;
      }
	
	public List<Object> execute_request() throws IOException {
		Response httpresponse = client.newCall(request).execute();
		response_code = httpresponse.code();
		response_content = httpresponse.body().string();
		System.out.println("Http Response code: \n"+response_code +
				"\nHttp Response content: \n"+ response_content);
		List<Object> response_list= new LinkedList<Object>();
		response_list.add(response_code);
		response_list.add(response_content);
		return response_list;
	}
	
	@When("^I hit the POST api endpoint \"([^\"]*)\"$")
	public void i_hit_the_POST_api_endpoint(String url){
		this.url = url;
		method = "POST";
	}
	
	@When("^create user with user details$")
	public void create_user_with_user_details(DataTable arg1){
		Map<String, String> args = arg1.asMap(String.class, String.class);
		JSONObject arg = new JSONObject(args);
		RequestBody body = RequestBody.create(arg.toString(), mediaType);
		request = new Request.Builder()
				.url(url)
				.addHeader("Content-Type", "application/json")
				.method(method,body)
				.build();
		}

	@Then("^New user should create$")
	public void new_user_should_create() throws IOException{
		List<Object> resp = execute_request();
		assert (Integer)resp.get(0) == 201;
	}

	@When("^I hit the PUT api endpoint \"([^\"]*)\"$")
	public void i_hit_the_PUT_api_endpoint(String url){
		this.url = url;
		method = "PUT";
	}

	@When("^Update the user with user details by put method$")
	public void update_the_user_with_user_details_by_put_method(DataTable arg1){
		Map<String, String> args = arg1.asMap(String.class, String.class);
		JSONObject arg = new JSONObject(args);
		RequestBody body = RequestBody.create(arg.toString(), mediaType);
		request = new Request.Builder()
				.url(url)
				.addHeader("Content-Type", "application/json")
				.method(method,body)
				.build();
	}
	
	@Then("^User should be updated$")
	public void user_should_be_updated() throws IOException{
		List<Object> resp = execute_request();
		assert (Integer)resp.get(0) == 200;
	}

	@When("^I hit the PATCH api endpoint \"([^\"]*)\"$")
	public void i_hit_the_PATCH_api_endpoint(String url){
		this.url = url;
		method = "PATCH";
	}

	@When("^Update the user with user details by patch method$")
	public void update_the_user_with_user_details_by_patch_method(DataTable arg1){
		Map<String, String> args = arg1.asMap(String.class, String.class);
		JSONObject arg = new JSONObject(args);
		RequestBody body = RequestBody.create(arg.toString(), mediaType);
		request = new Request.Builder()
				.url(url)
				.addHeader("Content-Type", "application/json")
				.method(method, body)
				.build();
	}
	
	@When("^I hit the DELETE api endpoint \"([^\"]*)\"$")
	public void i_hit_the_DELETE_api_endpoint(String url){
		this.url = url;
		method = "DELETE";
	}

	@Then("^User should be deleted$")
	public void user_should_be_deleted() throws IOException{
		request = new Request.Builder()
				.url(url)
				.addHeader("Content-Type", "application/json")
				.method(method, null)
				.build();
		List<Object> resp = execute_request();
		assert (Integer)resp.get(0) == 204;
	}
	
	@When("^I hit the file upload api endpoint \"([^\"]*)\"$")
	public void i_hit_the_file_upload_api_endpoint(String url) {
		this.url = url;
		method = "POST";
	}
	
	@And("^I upload the file$")
	public void i_upload_the_file() {
		mediaType = MediaType.parse("text/plain");
	    RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
	      .addFormDataPart("file","Screenshot from 2022-05-05 15-15-54.png",
	    		  RequestBody.create(new File("Sample_image.png"),
	    				  (MediaType.parse("application/octet-stream")
	    				  )))
	      .build();
		request = new Request.Builder()
				.url(url)
				.method(method, body)
				.build();
		
	}
	
	@Then("^File uploaded message should appear$")
	public void file_uploaded_message_should_appear() throws IOException {
		List<Object> resp = execute_request();
		assert (Integer)resp.get(0) == 200;
		assert resp.get(1).toString() == "File uploaded successfully";		
	}
}
