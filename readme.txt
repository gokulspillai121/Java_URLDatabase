Features Implemented through this Project:
1. Stores the url entered by the user
2. Generates a Unique key for the url's 
3. Creates a count value to show the number of occurences of the url
4. Lists out all the url in the database along with its key and count.


Commands used in the program:
storeurl   :   to store a url and to store the unique key generated for the url.
	       	eg: storeurl www.google.com
get	   :   to return the unique key of a url and increment its count value.
	       	eg: get www.google.com
count 	   :   to return the number of occurences of the url.
		eg: count www.goggle.com
list	   :   to list out all the urls' along with its uniquekey in JSON Format
		eg: list
exit	   :   to exit from the program
		eg: exit

How to run the Program through command prompt:
Step 1: Open command prompt.
Step 2: type 'javac urldatabase.java'
Step 3: java urldatabase
Step 4: Enter the commands
Step 5: Type 'exit' to exit the program.
