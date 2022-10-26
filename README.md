# spring-music-for-astradb

This is an application to demo astra db. It is based on [spring-music](https://github.com/cloudfoundry-samples/spring-music). 

## Quickstart
- create a [free astra db account](https://astra.datastax.com)
- create a astra db instance
- select role 'Database Administrator' and generate an application token  
- download the credentials  
- copy the keyspace name, the database id and the cloud provider region. You need to provide keyspace name, the database id, cloud provider region and application token when you start the application to allow the application to connect to your astra db instance.
- clone this repo
```
git clone https://github.com/difli/spring-music-for-astradb.git
```
- cd in folder 'spring-music-for-astra-db'
```
cd spring-music-for-astra-db
```
- run application and inject [credentials](https://github.com/difli/spring-music-for-astradb/blob/main/src/main/resources/application.yml#L16-L19) to access your astra db instance via env variables.
```
./gradlew bootRun -Dastra_application_token='AstraCS:dPbn...' -Dastra_database_id=2e1df845-3796-4bbb-9d44-f5725abbcac2 -Dastra_database_region=europe-west1 -Dastra_keyspace=demo
```
- open a [browser window](http://localhost:8080) to access the application ui
