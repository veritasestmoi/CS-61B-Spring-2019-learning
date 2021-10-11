/**********************Our First Java Program********************/

int size = 27; //Declare a varaible of type int and assigns it 
String name = "Fido"; 
Dog myDog = new Dog(name, size); //Declares and initializes a new variable of type Dog. Calls the dog constructor to create a new object of type Dog
int x = size - 5; //Declares a nnw var of type int and assigns it the val 22 
if (x < 15) { //no
myDog.bark(8);
}

while (x > 3) { //yes
x -= 1; //24
myDog.play();
}

int[] numList = {2, 4, 6, 8};
System.out.print("Hello ");
System.out.println("Dog: " + name);

System.out.println(numList[1]);
if (numList[3] == 8) {
System.out.println("potato");
}

//https://yintelligence.tech/2021/02/28/2021-02-28-Introduction-to-Java/