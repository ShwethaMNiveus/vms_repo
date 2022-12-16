package com.shwetham.simplejavaapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import java.net.URISyntaxException;

/*

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.shwetham.simplejavaapplication.controller.VehicleController;
import com.shwetham.simplejavaapplication.dto.VehicleDTO;
import com.shwetham.simplejavaapplication.repository.VehicleRepository;*/

//@RunWith(SpringRunner.class)
@SpringBootTest()
public class VehicleControllerTest {
	
	/*@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@LocalServerPort
    int randomServerPort;
 
    @Test
    public void Test_addVehicle() throws URISyntaxException 
    {
        final String baseUrl = "http://localhost:"+randomServerPort+"/VehicleSystem/create";
        URI uri = new URI(baseUrl);
        VehicleDTO dto = new VehicleDTO("1278365243", "2 wheeler", "Pept","yamaha",85000.00);
         
        HttpHeaders headers = new HttpHeaders();    
 
        HttpEntity<VehicleDTO> request = new HttpEntity<>(dto, headers);
         
        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
        System.out.println("result.getBody() "+result.getBody());
         
        //Verify request succeed
        Assert.assertEquals(true, result.getBody().contains("Vehicle data created Successfully"));
    }/*
	
    
  /*  @Test
    public void Test_getVehicle() throws URISyntaxException 
    {
        final String baseUrl = "http://localhost:"+randomServerPort+"/VehicleSystem/get";
        URI uri = new URI(baseUrl);
        VehicleDTO dto = new VehicleDTO(8L, "1278365243", "2 wheeler", "Pept","yamaha",85000.00);
         
        HttpHeaders headers = new HttpHeaders();    
 
        HttpEntity<VehicleDTO> request = new HttpEntity<>(dto, headers);
         
        ResponseEntity<String> result = this.restTemplate.getForEntity(uri, String.class);
        System.out.println("get	 result.getBody() type: "+result.getBody().getClass());
         
        //Verify request succeed
        Assert.assertTrue(true);
    }*/
    
    
   /* @Test
    public void Test_deleteVehicle() throws URISyntaxException 
    {
        final String baseUrl = "http://localhost:"+randomServerPort+"/VehicleSystem/delete&id="+15L;
        URI uri = new URI(baseUrl);
        VehicleDTO dto = new VehicleDTO();
         
        HttpHeaders headers = new HttpHeaders();    
 
        HttpEntity<VehicleDTO> request = new HttpEntity<>(dto, headers);
         
        ResponseEntity<String> result = this.restTemplate.delete(uri, request, String.class);
        System.out.println("delete result.getBody() "+result.getBody());
         
        //Verify request succeed
        Assert.assertEquals(true, result.getBody().contains("Vehicle data deleted Successfully"));
    }*/

}
