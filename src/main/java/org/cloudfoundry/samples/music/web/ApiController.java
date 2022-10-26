package org.cloudfoundry.samples.music.web;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.astra.sdk.AstraClient;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	  @Autowired
	  private AstraClient astraClient;
	  
	  @Autowired
	  private CassandraTemplate cassandraTemplate;
	  	  	
	  @GetMapping("/datacenter")
	  public String datacenter() {
	    return cassandraTemplate
	       .getCqlOperations()
	       .queryForObject("SELECT data_center FROM system.local", String.class);
	  }
	  
	  @GetMapping("/astra")
	  public String astra() { 
	    return astraClient.apiDevopsOrganizations().organizationId(); 
	  }
	  
	  @GetMapping("/rest")
	  public String rest() { 
	    return astraClient.apiStargateData().keyspaces().collect(Collectors.toList()).get(0).toString();
	  }
		

}
