ust like we have some rules that we follow to speak English (the grammar), we have some rules to follow while writing a Java program. The set of these rules is called syntax. [It’s like Vocabulary and Grammar of Java :)]

Variables
A variable is a container that stores a value.

This value can be changed during the execution of the program.

Example: int number = 8; (Here, int is a data type, number is the variable name and 8 is the value that it contains/stores)

Rules for declaring a variable name
We can choose a name while declaring a Java variable if the following rules are followed:

Must not begin with a digit. (E.g. 1arry is an invalid variable)
Name is case sensitive. (harry and Harr are different)
Should not be a keyword (like Void)
White Space not allowed. (int Code With Harry is invalid)
Can contain alphabets, $character, _character, and digits if the other conditions are met.
Data Types
Data types in Java fall under the following categories

Primitive Data Types (Intrinsic)
Non-Primitive Data Types (Derived)
Primitive Data Types
Java is statically typed i.e. variables must be declared before use.

There are 8 primitive data types supported by Java:

byte     ➼   •value ranges from -128 to 127
                  •takes 1 byte 
                  •default value is 0

short    ➼   •value ranges from -(216)/2  to  (216)/2 - 1
                   •takes 1 byte 
                   •default value is 0  

int        ➼    •value ranges from -(232)/2 to (232)/2 - 1
                    •takes 2 byte 
                    •deafault value is 0
 
float      ➼    •value ranges from (see Docs)
                    •takes 4 byte
                    •deafault value is 0.0f

long      ➼    •value ranges from -(264) /2 to (264)/2 - 1
                    •takes 8 byte 
                    •default value is 0

double   ➼  •value ranges from (see Docs)
                   •takes 8 byte 
                   •deafault value is 0.0d

char       ➼  •value ranges from 0 to 65535(216 - 1)
                    •takes 2 byte 
                    •default value is 

boolean ➼   •value can be true or false
                    •size depend on JVM
                    •default value is false
