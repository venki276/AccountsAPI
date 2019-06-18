package com.anz.accounts.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class AccountsControllerTest extends AccountsAPITest {

	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	   
	   @Test
	   public void getAccountsList() throws Exception {
	      String uri = "/getAccounts";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertTrue(!"[]".equals(content));
	      assertTrue(content.length() > 2);
	   }
	   
	   @Test
	   public void getTransactionList() throws Exception {
	      String uri = "/getTransactions/585309209";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertTrue(!"[]".equals(content));
	      assertTrue(content.length() > 2);
	   }
	

}
