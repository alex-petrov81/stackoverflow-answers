# stackoverflow-answers

response to  the following question: https://stackoverflow.com/questions/52127174/javax-validation-unexpectedtypeexception-using-spring-constraintvalidator-for-an

Autowiring example 

#Test scenario

1. Send the following command by using curl 

  
````
curl -v  http://localhost:2222/api/path
````

and you will see the answer 

````
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 2222 (#0)
> GET /api/path HTTP/1.1
> Host: localhost:2222
> User-Agent: curl/7.54.0
> Accept: */*
> 
< HTTP/1.1 400 
< Content-Length: 0
< Date: Thu, 06 Sep 2018 08:55:23 GMT
< Connection: close
< 
* Closing connection 0
````

2. Check RegistrationController and EnumValueValidator and ensure that OrganizationService has been autowired correctly. 


