# Individual-project-preethibilla

Name: Preethi Billa
Student Id: 015920411

individual-project-preethibilla created by GitHub Classroom

# Problem Statement:

To create and implement a Java application that allows users to order and purchase products. This application validates purchases by comparing them to the existing quantity and cap allowed for that category. The application checks to see if the requested quantity for each item is permissible.

### Note:
* In my application, I have set my cap values for the items Essentials,Luxury, and Misc to a maximum of 10.
* If the purchase meets all of the requirements, the total amount paid will be displayed in the output.csv file .Otherwise, errors will be displayed in the error.txt file.

# Steps to be followed to run the application:

1. Go to repo individual-project-preethibilla,download the file by clicking code->download zip file.
2. Once the zip is downloaded, extract the .zip file.You need Visual studio code IDE to run the code.
3. Open the zipped folder or the entire folder in VSCode using Open Project.
4. After opening the project go to src/Billing --> Billing.java, compile and run the project.

If the java version is not compatible please download the correct JDK version ( Oracle JDK 17).
* Install java extensions in visual studio code.

Build and run the code next and you will get the output displayed in Sample-Output.csv file.

Compile 

* javac Billing.java

Run 
* java Billing.java

Now, you will be prompted asking as below:
Enter the name of the input file for testing:  You need to enter the input path

Example of my Input.csv:

 /Users/admin/Desktop/CMPE202/individual-project-preethibilla/src/resources/Input.csv

### Note: Enter the input file path according to your directory.

Output gets displayed in the generated Output.csv file for successful order and for any errors the errors.txt file is generated and can check the same in the project folder under Output.csv or errors.txt.

If there are any errors the below text gets displayed.
Payment is incomplete due to incorrect Quantities, check the error.txt file

# Design Patterns implemented in the application:
 * Singleton Pattern
 * Chain of Responsibility
 * Factory

## Singleton :

This creational pattern involves a single class that is responsible for creating an object while ensuring that only one object is created and provides a way to directly access its single object without the need to instantiate the class's object.

This pattern is used to obtain the category cap values for the application. When an Instance of cap values is required, the getInstance() method is used to retrieve the cap values of the categories.

![image](https://user-images.githubusercontent.com/42039081/167054107-22729404-2cf1-4f70-a109-27fb933b5cf5.png)

      

## Chain of Responsibility :

A request from the client is passed to a chain of objects to be processed in the chain of responsibility pattern. Later, the objects in the chain will decide who will process the request and whether or not the request needs to be sent to the next object in the chain.

This is a behavioral pattern.

This pattern is used to validate the quantity and price of the purchase in a step-by-step manner. First, the quantity and cap of the products are validated, and then the total price of the purchase is calculated.

![image](https://user-images.githubusercontent.com/42039081/167054087-e9e018be-169b-42ff-8acd-31da3d5ee991.png)


## Factory :

A Factory Method is a creational design pattern that provides an interface for creating objects in a superclass while allowing subclasses to change the type of objects created.

This pattern is used to locate and read the dataset or input file. When the Handler determines which file to read, the appropriate class is implemented. The InputReader class is used to read input files, whereas the ReadData class is used to read dataset files.


![image](https://user-images.githubusercontent.com/42039081/167054132-f5f67704-5fe5-4dcc-b958-cc9d8788cc18.png)



## TestCases1 :

In this test case i took the same items as in the sample input file given.

![Testcase1 1](https://user-images.githubusercontent.com/42039081/167067669-ce90d72f-c878-4144-875b-95f9a401c0b7.png)

In the terminal , compile and run the java application.

Copy the input file path of your choice , and enter the path in the terminal.

![Testcase1 2](https://user-images.githubusercontent.com/42039081/167067692-f81e26d7-8c3d-4626-973d-b625166529c9.png)

The amount gets calculated and the output.csv file gets generated as the values given for items in input.csv are valid.

![Testcase1 3](https://user-images.githubusercontent.com/42039081/167067697-33a90892-80de-43f5-b450-92c6eba6fa4a.png)

## TestCases2 :

Cards.csv file contains the below card numbers.

![Testcase2 1](https://user-images.githubusercontent.com/42039081/167067703-416b53ec-ec68-4fc0-b94e-ae58021f4acd.png)

In Input2.csv there is one new card which is missing in Cards.csv.

![Testcase2 2](https://user-images.githubusercontent.com/42039081/167067714-be357e5e-d825-4875-a5d7-6349c18b9c3a.png)

Repeat the process of complile and run as in testcase1.
The message of card getting added is diaplayed.

![Testcase2 3](https://user-images.githubusercontent.com/42039081/167067722-2c3773ad-03c1-409a-8961-3dff7349bb53.png)

Total price of the items is displayed in Output.csv file.

![Testcase2 4](https://user-images.githubusercontent.com/42039081/167067726-8cd82cd8-ca37-4039-9baa-7559c1db9c67.png)

## TestCase3 :

In this test case, select the Input3.csv for compile and run of the application.

![Testcase3 1](https://user-images.githubusercontent.com/42039081/167067731-35ed7274-72af-4a34-951b-05edf9c7167e.png)

After successful execution the below message is displayed in the terminal.

![Testcase3 2](https://user-images.githubusercontent.com/42039081/167067745-c8684683-1363-4c05-87f7-6596bfe19fb3.png)

error.txt file gets generated as the entered item values in input file are invalid according to the cap values set.

![Testcase3 3](https://user-images.githubusercontent.com/42039081/167067762-11035b1d-7086-42c5-891a-7da76ed3441c.png)









