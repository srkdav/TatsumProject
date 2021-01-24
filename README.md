# TatsumProject

## Please modify applciation.properties file as per local system's SQL Settings.

How to use this REST API? 

1. Register new User (POST request at): http://localhost:8080/registerUser
    {
    "user": {
        "name":"company b"
    }
  }

2. Register factors/areas(POST request at)  : http://localhost:8080/enterFactors
  {
      "factor": {
        "factor_id":1,
        "factor_name":"career"
      }
    
  }
  
 3. Submit entries for each user as per their ID, factor ID and factor score  (POST request at): http://localhost:8080/enterPriority
 
 {
    "factorUsageReq": {
        "factor_id":2,
        "user_id":2,
        "factor_score":4
    }
    
}

4. Get all factors (GET Request at): http://localhost:8080/findAllFactors
