# stackoverflow-answers

response to  the following question: https://stackoverflow.com/questions/52046510

#Test scenario
1. Send auth token request to the http://localhost:2222/oauth/token

You've got  the response  like this
````
{
   "access_token": "81463f1d-a944-4787-a963-511aae55298f",
   "token_type": "bearer",
   "refresh_token": "13f8f950-6677-4637-aa7b-8b6b41292626",
   "expires_in": 2999,
   "scope": "read write trust"
}
````

2. Get access_token value from step 1 and send the following request by using Curl

````
curl -H "Authorization: Bearer 81463f1d-a944-4787-a963-511aae55298f" http://localhost:2222/api/getusers
````

````
curl -H "Authorization: Bearer 81463f1d-a944-4787-a963-511aae55298f" http://localhost:2222/api/getclients
````

for spring-boot-1.5.2 version please check branch  question-52046510-boot-1-5
