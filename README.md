# Individual-project-preethibilla

Name: Preethi Billa
Student Id: 015920411

individual-project-preethibilla created by GitHub Classroom

# Problem Statement:

To create and implement a Java application that allows users to order and purchase products. This application validates purchases by comparing them to the existing quantity and cap allowed for that category. The application checks to see if the requested quantity for each item is permissible.
Note: In my application, I have set my cap values for the items Essentials,Luxury, and Misc to a maximum of 10.
If the purchase meets all of the requirements, the total amount paid will be displayed in the output.csv file .Otherwise, errors will be displayed in the error.txt file.

# Steps to be followed to run the application:

1. Go to repo individual-project-preethibilla,download the file by clicking code->download zip file.
2. Once the zip is downloaded, extract the .zip file.You need Visual studio code IDE to run the code.
3. Open the zipped folder or the entire folder in VSCode using Open Project.
4. After opening the project go to src/Billing --> Billing.java, compile and run the project.

If the java version is not compatible please download the correct JDK version ( Oracle JDK 17).
* Install java extensions in visual studio code.

Build and run the code next and you will get the output displayed in Sample-Output.csv file.

compile->javac Billing.java
run->java Billing.java
To give the input information after succesful run it will ask us as below:
Enter the name of the input file for testing:
/Users/admin/Desktop/CMPE202/individual-project-preethibilla/src/resources/Input.csv
Note: Enter the input file path according to your directory.

Output gets displayed in the generated Output.csv file for successful order and for any errors the errors.txt file is generated and can check the same in the project folder under Output.csv or errors.txt.

If there are any errors the below text gets displayed.
Payment is incomplete due to incorrect Quantities, check the error.txt file

# Design Patterns implemented in the application:
Singleton Pattern
Chain of Responsibility
Factory

# Singleton :

This creational pattern involves a single class that is responsible for creating an object while ensuring that only one object is created and provides a way to directly access its single object without the need to instantiate the class's object.

This pattern is used to obtain the category cap values for the application. When an Instance of cap values is required, the getInstance() method is used to retrieve the cap values of the categories.

![image](https://user-images.githubusercontent.com/42039081/167054107-22729404-2cf1-4f70-a109-27fb933b5cf5.png)

      

# Chain of Responsibility :

A request from the client is passed to a chain of objects to be processed in the chain of responsibility pattern. Later, the objects in the chain will decide who will process the request and whether or not the request needs to be sent to the next object in the chain.

This is a behavioral pattern.

This pattern is used to validate the quantity and price of the purchase in a step-by-step manner. First, the quantity and cap of the products are validated, and then the total price of the purchase is calculated.

![image](https://user-images.githubusercontent.com/42039081/167054087-e9e018be-169b-42ff-8acd-31da3d5ee991.png)


# Factory :

A Factory Method is a creational design pattern that provides an interface for creating objects in a superclass while allowing subclasses to change the type of objects created.

This pattern is used to locate and read the dataset or input file. When the Handler determines which file to read, the appropriate class is implemented. The InputReader class is used to read input files, whereas the ReadData class is used to read dataset files.


![image](https://user-images.githubusercontent.com/42039081/167054132-f5f67704-5fe5-4dcc-b958-cc9d8788cc18.png)

