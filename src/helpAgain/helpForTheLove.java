package helpAgain;

public class helpForTheLove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Problem One
		
		
int[] age = {3, 9, 23, 64, 2, 8, 28, 93};

int arrayLength = age.length;
int diff = Math.abs(age[arrayLength - arrayLength] - age[arrayLength - 1]);

System.out.println("The difference between the first and last element of age is " + diff + ".");


int[] newAge = new int[age.length];
System.arraycopy(age, 0, newAge, 0, age.length);
	
	
	arrayLength = newAge.length;
	newAge[arrayLength -1] = 64;
	diff = Math.abs(newAge[arrayLength - arrayLength] - newAge[arrayLength - 1]);
	
	
System.out.println("The difference between the first and last element of the new age = " + diff + " .");
	
		int sum = 0;
		for (int a = 0; a < newAge.length; a++) {
			sum += newAge[a];
		}
		double avg = sum / arrayLength;
		
System.out.println("Average age including new age = " + avg + "!");



	
// Problem 2

String[] name = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
sum = 0;

for (int a = 0; a < name.length; a++) {
	sum += name[a].length();
}

avg = sum / name.length;

System.out.println("Average number of letters in names = " + avg + "!");

String everyName = "";

for (int a = 0; a < name.length; a++) {
	everyName += name[a] + " ";
}

System.out.println(everyName);
	


// Problem 3
	// To access the last element of any array you would use the length array method and subtract 1.
	
//Problem 4 
	// To access the first element of any array you can use the method array[0] to find the first element.
	//Arrays start at 0, not 1.
	
// Problem 5
	
int[] nameLength = new int[name.length];
for (int a = 0; a < name.length; a++) {
	nameLength[a] = name[a].length();
}


// Problem 6

sum = 0;
for (int a = 0; a < nameLength.length; a++) {
	sum += nameLength[a];
}
System.out.println("The sum of name lengths = " + sum + "!");
	



// Problem 7
	
	String coolWord = "fire";
	String longerWord = "";
	
	for (int a = 1; a < coolWord.length(); a++) {
		 longerWord += coolWord;
	}
System.out.println(longerWord);

// Problem 8

String firstName = "Shawn";
String lastName = "Rogers";
String fullName = firstName + " " + lastName;
System.out.println(fullName);

	
	

// Problem 9

		int digits[] = {15, 34, 24, 54};
		int total = 0;

		for (int i : digits)
		    total += i;
	if (total > 100) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}

	
	// Problem 10
	
	double numbahs[] = {50, 50, 50};
	double summm = 0;
	for (double i : numbahs)
		summm += i;
	avg = summm / numbahs.length;
	System.out.println(avg);
	
	
	
	

	// Problem 11
	
double secondArray[] = {25, 25, 25};
double summm2 = 0;
for (double i : secondArray)
	summm2 += i;
double avg2 = summm2 / secondArray.length;

if (avg > avg2) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
	
	// Problem 12

boolean isHotOutside = true;
boolean willBuyDrink;
double moneyInPocket = 28.25;

if (isHotOutside && moneyInPocket > 10.50) {
	System.out.println("true");
}
else {
	System.out.println("false");
}

	// Problem 13 

boolean isAssignmentComplete = true;

if (isAssignmentComplete) {
	System.out.println("Yay look at you go!");
}

// This method above answers the question, is the assignment complete? 
// since the value was designated to true, the console printed "Yay look at you go!" 
	
	
	
	}
}

	
	













