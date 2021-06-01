package api.sqe_demo.api_module.apipageclasses; 

public class API_POSTDataset{

public static final int datasetLength = 1; 

public static String projectName = "sqe_demo";

			/*--------Dataset1 Dataset-----------*/

public static final String datasetHeader1 = "TC_CRUD_API-Dataset1";

public static final String datasetResources1 = "api/register";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "API_POST";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n    \\\"email\\\": \\\"eve.holt@reqres.in\\\","
 + "\\n    \\\"password\\\": \\\"pistol\\\"\\n}\","
 + "\"raw_id\":1432,"
 + "\"dataset_id\":1436,"
 + "\"raw_type_id\":3}";

}