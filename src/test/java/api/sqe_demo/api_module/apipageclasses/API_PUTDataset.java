package api.sqe_demo.api_module.apipageclasses; 

public class API_PUTDataset{

public static final int datasetLength = 1; 

public static String projectName = "sqe_demo";

			/*--------Dataset1 Dataset-----------*/

public static final String datasetHeader1 = "TC_CRUD_APIs-Dataset1";

public static final String datasetResources1 = "api/users/2";
public static final int requestType1 = 3;
public static final int bodyType1 = 3;
public static final String apiName1 = "API_PUT";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"devrabbit\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n    \\\"email\\\": \\\"eve.holt@reqres.in\\\","
 + "\\n    \\\"password\\\": \\\"pistol\\\"\\n}\","
 + "\"raw_id\":1438,"
 + "\"dataset_id\":1688,"
 + "\"raw_type_id\":3}";

}