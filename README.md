https://youtu.be/i5SfuWAzXWE
Dynamic Calculator

To get the application running we start the SimpleWebServer which listens on port 23657. When we start the dynamic calculator, we get a popup box which contains 3 fields which are user editable fields:
1.	First Operand
2.	Second Operand
3.	Operator Symbol (+,-,*,/,l,r)
The various operator symbols we have are + (Addition of two numbers), - (Subtraction of two numbers), * (Multiplication of two numbers), / (Division of two numbers), l(log of number, first operand is the number you want to get the logarithm from, while the second operand is the base for the logarithm), r (root of number, first operand is number that you will want to take the root from while the second operand is the base of the root).

After entering the values the following process takes place:
1.	In dynamic calculator, the values for first and second operand are entered by user, if the values are inappropriate an appropriate error message is shown. Same in case of inappropriate operator.
2.	The operator loader will load the class associated with the operation string. In case of class not being in the cache, server gets requested. The operation class file is sent by the server. This is done using the method loadClass(), then findClass() function loads the class associated with name and returns the class. The object of the operator class is created using private method getOperation() and the operands are passed to the calculate function. On successful completion of the operation, it is saved in the cache.
3.	The operation object is loaded based on the value of the operation. If the operation is already performed then the operation classes are located in the cache and the operation is loaded from the cache.
4.	 The operation object is used to calculate the mathematical operation for the operand.
5.	The respective mathematical operations are performed based on the user input.
6.	The user can change the operands and operator value and get the result displayed on GUI.
