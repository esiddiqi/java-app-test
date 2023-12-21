# This is my test application for Performing Labs  

- In this Project , I have created a JAVA application (Login Screen)
- From which you may create the war file to be deployed on Web Server like Apache tomcat.


Once you Clone the repo, You may build the application using below command  
**`mvn clean package`**  
This command will create a .war file in ./target directory  



## How To Deploy ?  

### Method 1 :  
Once the War is created you may now Deploy the war on tomcat Web Server by just moving the war to ./tomcat/webapps Directory  
Access the Login Page at `http://localhost:8080/login-page`  


### Method 2 :  
You may use my Dockerfile and build an image form the Docker file , And Deploy the image on Kubernetes cluster  
(refer Deployement.yaml and Service.yaml)  




If Deployed on Minikube , You May run below command to port-forward  
`kubectl port-forward service/your-app-service 9090:80`  
 Access the page at : `http://localhost:9090/login-page/`  


           

