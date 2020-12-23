package com.assignment.lab.service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	
	private static Logger logger = LogManager.getLogger();

	@Override
	public Object getByNameAsc() {
		
		System.out.println("Inside ");
		JSONParser parser = new JSONParser();
		org.json.JSONArray sortedJsonArray = new  org.json.JSONArray();
		try {
			JSONArray  obj = (JSONArray)parser.parse(new FileReader("data.json"));
			
			List<Object> objectList = new ArrayList<>();
 
			for (Object o : obj){
			    JSONObject hospital = (JSONObject) o;
			    hospital.get("hospid");			   
			    hospital.get("hospname");
			    hospital.get("statecode");
			    hospital.get("state");
			    hospital.get("districtid");
			    hospital.get("district");			    
			    hospital.get("hospcontactno");
			    hospital.get("hospaddress");
			    hospital.get("hosptype");
			    objectList.add(hospital);
			  }	
			String list = objectList.toString();						
			org.json.JSONArray jsonArr = new  org.json.JSONArray(list);
			    
			List<org.json.JSONObject> jsonValues = new ArrayList<org.json.JSONObject>();
		    for (int i = 0; i < jsonArr.length(); i++) {
		        jsonValues.add(jsonArr.getJSONObject(i));
		    }
		    Collections.sort( jsonValues, new Comparator<org.json.JSONObject>() {		       
		        private static final String KEY_NAME = "hospname";
		        @Override
		        public int compare(org.json.JSONObject a, org.json.JSONObject b) {
		            String valA = new String();
		            String valB = new String();
		            try {
		                valA = (String) a.get(KEY_NAME);
		                valB = (String) b.get(KEY_NAME);
		            } 
		            catch (JSONException e) {
		            	e.printStackTrace();
		            }
		            return valA.compareTo(valB);
		        }
		    });
		    for (int i = 0; i < jsonArr.length(); i++) {
		        sortedJsonArray.put(jsonValues.get(i));
		    }
		    System.out.println(sortedJsonArray);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return sortedJsonArray.toString();
}

	@Override
	public Object getByDistrictAsc() {
		
		System.out.println("Inside ");
		JSONParser parser = new JSONParser();
		org.json.JSONArray sortedJsonArray = new  org.json.JSONArray();
		try {
			JSONArray  obj = (JSONArray)parser.parse(new FileReader("data.json"));
			
			List<Object> objectList = new ArrayList<>();
 
			for (Object o : obj){
			    JSONObject hospital = (JSONObject) o;
			    hospital.get("hospid");			   
			    hospital.get("hospname");
			    hospital.get("statecode");
			    hospital.get("state");
			    hospital.get("districtid");
			    hospital.get("district");			    
			    hospital.get("hospcontactno");
			    hospital.get("hospaddress");
			    hospital.get("hosptype");
			    objectList.add(hospital);
			  }	
			String list = objectList.toString();						
			org.json.JSONArray jsonArr = new  org.json.JSONArray(list);
			    
			List<org.json.JSONObject> jsonValues = new ArrayList<org.json.JSONObject>();
		    for (int i = 0; i < jsonArr.length(); i++) {
		        jsonValues.add(jsonArr.getJSONObject(i));
		    }
		    Collections.sort( jsonValues, new Comparator<org.json.JSONObject>() {		       
		        private static final String KEY_NAME = "districtid";
		        @Override
		        public int compare(org.json.JSONObject a, org.json.JSONObject b) {
		            String valA = new String();
		            String valB = new String();
		            try {
		                valA = (String) a.get(KEY_NAME);
		                valB = (String) b.get(KEY_NAME);
		            } 
		            catch (JSONException e) {
		            	e.printStackTrace();
		            }
		            return valA.compareTo(valB);
		        }
		    });
		    for (int i = 0; i < jsonArr.length(); i++) {
		        sortedJsonArray.put(jsonValues.get(i));
		    }
		    System.out.println(sortedJsonArray);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return sortedJsonArray.toString();
}

	@Override
	public Object getByStateAsc() {
		
		System.out.println("Inside ");
		JSONParser parser = new JSONParser();
		org.json.JSONArray sortedJsonArray = new  org.json.JSONArray();
		try {
			JSONArray  obj = (JSONArray)parser.parse(new FileReader("data.json"));
			
			List<Object> objectList = new ArrayList<>();
 
			for (Object o : obj){
			    JSONObject hospital = (JSONObject) o;
			    hospital.get("hospid");			   
			    hospital.get("hospname");
			    hospital.get("statecode");
			    hospital.get("state");
			    hospital.get("districtid");
			    hospital.get("district");			    
			    hospital.get("hospcontactno");
			    hospital.get("hospaddress");
			    hospital.get("hosptype");
			    objectList.add(hospital);
			  }	
			String list = objectList.toString();						
			org.json.JSONArray jsonArr = new  org.json.JSONArray(list);
			    
			List<org.json.JSONObject> jsonValues = new ArrayList<org.json.JSONObject>();
		    for (int i = 0; i < jsonArr.length(); i++) {
		        jsonValues.add(jsonArr.getJSONObject(i));
		    }
		    Collections.sort( jsonValues, new Comparator<org.json.JSONObject>() {		       
		        private static final String KEY_NAME = "statecode";
		        @Override
		        public int compare(org.json.JSONObject a, org.json.JSONObject b) {
		            String valA = new String();
		            String valB = new String();
		            try {
		                valA = (String) a.get(KEY_NAME);
		                valB = (String) b.get(KEY_NAME);
		            } 
		            catch (JSONException e) {
		            	e.printStackTrace();
		            }
		            return valA.compareTo(valB);
		        }
		    });
		    for (int i = 0; i < jsonArr.length(); i++) {
		        sortedJsonArray.put(jsonValues.get(i));
		    }
		    System.out.println(sortedJsonArray);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return sortedJsonArray.toString();
}

	@Override
	public Object byHospitalByCode(String code) {
		String element=null;
		JSONParser parser = new JSONParser();
		try {
			JSONArray  obj = (JSONArray)parser.parse(new FileReader("data.json"));			
			List<Object> objectList = new ArrayList<>(); 
			for (Object o : obj){
			    JSONObject hospital = (JSONObject) o;			    
			    hospital.get("hospid");			   
			    hospital.get("hospname");
			    hospital.get("statecode");
			    hospital.get("state");
			    hospital.get("districtid");
			    hospital.get("district");			    
			    hospital.get("hospcontactno");
			    hospital.get("hospaddress");
			    hospital.get("hosptype");			   
			    objectList.add(hospital);
			  }
			String list = objectList.toString();
			org.json.JSONArray jsonArr = new  org.json.JSONArray(list);
			 int x=0;
			 for(int index = 0; index < jsonArr.length(); index++) {
				 org.json.JSONObject jsonObject = jsonArr.getJSONObject(index);
		            if(jsonObject.getString("hospid").equals(code)) {
		            	x=index;
		                System.out.println(index); //this is the index of the JSONObject you want
		            } 
		        }
			 System.out.println(objectList.get(x));
			 element = String.valueOf(objectList.get(x));
			 System.out.println(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
}
