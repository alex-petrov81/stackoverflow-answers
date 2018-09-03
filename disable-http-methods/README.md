# stackoverflow-answers

response to  the following question: https://stackoverflow.com/questions/52139240/how-to-disable-http-methods-in-embedded-tomcat/

#Test scenario
1. Send the following request to the  http://localhost:2222/api/getclients

````
 curl -v  http://localhost:2222/api/getclients
````

You will see the following answer:

````
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 2222 (#0)
> GET /api/getclients HTTP/1.1
> Host: localhost:2222
> User-Agent: curl/7.54.0
> Accept: */*
> 
< HTTP/1.1 200 
< Access-Control-Allow-Methods: GET, HEAD, POST, PUT, DELETE, PATCH
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 11
< Date: Mon, 03 Sep 2018 06:42:54 GMT
< 
* Connection #0 to host localhost left intact
````

````
< Access-Control-Allow-Methods: GET, HEAD, POST, PUT, DELETE, PATCH 
 ````
 
 - is what you are looking for.
