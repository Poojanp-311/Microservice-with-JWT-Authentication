package com.jwt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jwt.model.ApiModel;
import com.jwt.model.CategoryCount;
import com.jwt.model.Output;

@RestController
public class FetchingDataFromPublicApi {
	
	
    @Autowired  
	private RestTemplate restTemplate;
    
    
    @GetMapping("/sampleapi")
    public ApiModel fetchData() {
    	
    	ApiModel apiResponse = restTemplate.getForObject("https://api.publicapis.org/entries", ApiModel.class);
    	
    	
    	return apiResponse;
    }
    
    @GetMapping("/fetchdata")
    public List<Output> fetchDataa() {
    	
    	ApiModel apiResponse = restTemplate.getForObject("https://api.publicapis.org/entries", ApiModel.class);
    	
 	    System.out.println(apiResponse);
        Map<String, Integer> categoryCounts = new HashMap<>();

        // Count occurrences of each category
        for (CategoryCount op : apiResponse.getEntries()) {
            String category = op.getCategory();
            categoryCounts.put(category, categoryCounts.getOrDefault(category, 0) + 1);
        }

        // Convert category counts to a list of Output objects
        List<Output> outputList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : categoryCounts.entrySet()) {
            Output output = new Output();
            output.setCategory(entry.getKey());
            output.setCount(entry.getValue());
            outputList.add(output);
        }
        
        return outputList;
    }
    
    
    

    
    
}
