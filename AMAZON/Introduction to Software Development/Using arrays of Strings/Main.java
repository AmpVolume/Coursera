public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        System.out.println("Batman");
        System.out.println("Superman");
        System.out.println("Wonder Woman");
        System.out.println("Spider-Man");
        System.out.println("Iron Man");

        // Print the introduction years
        System.out.println("Introduction Years:");
        System.out.println(1939);
        System.out.println(1938);
        System.out.println(1941);
        System.out.println(1962);
        System.out.println(1963);

        System.out.println("Original superhero name at position 3: Wonder Women");
        // TODO 3a: Print the original name of the third superhero
        superheroes[2] = "Thor";
        // TODO 3b: Modify the third superhero name
        System.out.println("Modified superhero name at position 3:" + superheroes[2]);
        // TODO 3c: Print the modified name of the third superhero

        System.out.println("Original introduction year for superhero at position 3: 1941");
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3:" + introductionYears[2]);

        // TODO 5a: Print the length of the array containing superhero names
        System.out.println("Total superheroes names in String array: " + superheroes.length);
        // TODO 5b: Print the length of the array containing superhero year of introduction
        System.out.println("Total superheroes introduction year in int array: " + introductionYears.length);

