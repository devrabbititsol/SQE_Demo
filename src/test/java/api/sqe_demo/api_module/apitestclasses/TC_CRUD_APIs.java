package api.sqe_demo.api_module.apitestclasses;

import com.restassured.services.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import api.sqe_demo.api_module.apipageclasses.API_POSTDataset;
import api.sqe_demo.api_module.apipageclasses.API_GETDataset;
import api.sqe_demo.api_module.apipageclasses.API_PUTDataset;
import api.sqe_demo.api_module.apipageclasses.API_DELETEDataset;
public class TC_CRUD_APIs extends BaseClass {

	private Logger logger;
	private ConfigFilesUtility configFileObj;

	public TC_CRUD_APIs() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_CRUD_APIs.class);
		configFileObj= new ConfigFilesUtility();
		configFileObj.loadPropertyFile("TC_CRUD_APIs.properties");
	}

	@Test(priority = 1)
	public void doRequest() throws Exception { 
	
		for(int i = 1; i <= configFileObj.getIntProperty("datasetsLength"); i++) {
			boolean isExecutionFlag = true;			
		/*--------------------- POST --------------------- */

			if(isExecutionFlag) {
 			 	Object object = (Object) new API_POSTDataset();
				Class<?> c = object.getClass();
				String urlParams = (String) c.getField("urlParams" + i).get(object);
				if(urlParams == null) return;
				String headers = (String) c.getField("headers" + i).get(object);
				String body = (String) c.getField("body" + i).get(object);
				String authenticationData = (String) c.getField("authenticationData" + i).get(object);
				String apiName = (String) c.getField("apiName" + i).get(object);
				String datasetResources = (String) c.getField("datasetResources" + i).get(object);
				int reqType = (Integer) c.getField("requestType" + i).get(object);
				int bodyType = (Integer) c.getField("bodyType" + i).get(object);
				String response = APIService.callRequest(configFileObj,apiName, urlParams, headers, reqType, bodyType, body, configFileObj.getProperty("dataset" +i), datasetResources, authenticationData, formurlEncodedData, formData, linkParams,statusParams, logger);
			}

		/*--------------------- GET --------------------- */

			if(isExecutionFlag) {
 			 	Object object = (Object) new API_GETDataset();
				Class<?> c = object.getClass();
				String urlParams = (String) c.getField("urlParams" + i).get(object);
				if(urlParams == null) return;
				String headers = (String) c.getField("headers" + i).get(object);
				String body = (String) c.getField("body" + i).get(object);
				String authenticationData = (String) c.getField("authenticationData" + i).get(object);
				String apiName = (String) c.getField("apiName" + i).get(object);
				String datasetResources = (String) c.getField("datasetResources" + i).get(object);
				int reqType = (Integer) c.getField("requestType" + i).get(object);
				int bodyType = (Integer) c.getField("bodyType" + i).get(object);
				String response = APIService.callRequest(configFileObj,apiName, urlParams, headers, reqType, bodyType, body, configFileObj.getProperty("dataset" +i), datasetResources, authenticationData, formurlEncodedData, formData, linkParams,statusParams, logger);
			}

		/*--------------------- PUT --------------------- */

			if(isExecutionFlag) {
 			 	Object object = (Object) new API_PUTDataset();
				Class<?> c = object.getClass();
				String urlParams = (String) c.getField("urlParams" + i).get(object);
				if(urlParams == null) return;
				String headers = (String) c.getField("headers" + i).get(object);
				String body = (String) c.getField("body" + i).get(object);
				String authenticationData = (String) c.getField("authenticationData" + i).get(object);
				String apiName = (String) c.getField("apiName" + i).get(object);
				String datasetResources = (String) c.getField("datasetResources" + i).get(object);
				int reqType = (Integer) c.getField("requestType" + i).get(object);
				int bodyType = (Integer) c.getField("bodyType" + i).get(object);
				String response = APIService.callRequest(configFileObj,apiName, urlParams, headers, reqType, bodyType, body, configFileObj.getProperty("dataset" +i), datasetResources, authenticationData, formurlEncodedData, formData, linkParams,statusParams, logger);
			}

		/*--------------------- DELETE --------------------- */

			if(isExecutionFlag) {
 			 	Object object = (Object) new API_DELETEDataset();
				Class<?> c = object.getClass();
				String urlParams = (String) c.getField("urlParams" + i).get(object);
				if(urlParams == null) return;
				String headers = (String) c.getField("headers" + i).get(object);
				String body = (String) c.getField("body" + i).get(object);
				String authenticationData = (String) c.getField("authenticationData" + i).get(object);
				String apiName = (String) c.getField("apiName" + i).get(object);
				String datasetResources = (String) c.getField("datasetResources" + i).get(object);
				int reqType = (Integer) c.getField("requestType" + i).get(object);
				int bodyType = (Integer) c.getField("bodyType" + i).get(object);
				String response = APIService.callRequest(configFileObj,apiName, urlParams, headers, reqType, bodyType, body, configFileObj.getProperty("dataset" +i), datasetResources, authenticationData, formurlEncodedData, formData, linkParams,statusParams, logger);
			}
		}
	}}
