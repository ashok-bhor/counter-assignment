##Counter Assignment

####Installation
Run command after cloning the app: `mvn clean install`

####Build Docker Image
In the project root directory run the command to build docker image: `docker build -t counter-assignment:latest .`


####Run docker image
Launch the docker image: `docker run -p 5000:8080 counter-assignment`

####Running the Application
1. To get the current Counter, set the request type as **POST** 
	and request URL as: `localhost:5000/counter/getCurrent`

2. To get the List of Counters, set the request type as **GET** 
	and request URL as: `localhost:5000/counter/getCounterList`