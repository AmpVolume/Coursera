Work on this code in VS Code lab was incoorect and didnt follow instructions

Had to use @Override to get results
then needed to redirect classes
used javac to remind code that these classes still exist
then I ran the classes through animal 

mkdir -p classes\n
javac -d classes Animal.java Dog.java Cat.java Cow.java AnimalFarm.java\n
java -cp classes AnimalFarm
