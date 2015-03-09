public class Main {

    public static void main(String[] args) {
	// write your code here
        Main app = new Main();

        // =====

        int value = 7;
        System.out.println("1. Value is " + value);

        app.show(value);

        // =====

        System.out.println();
        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);

        app.show(person);

        System.out.println("4. Person is : " + person);

    }

    private void show(int value) {
        value += 2;
        System.out.println("2. Value is " + value);
    }

    public void show(Person person){

        System.out.println("2. Person is : " + person);

        person.setName("pippo");
//        System.out.println("5. Person is : " + person);
        // in this case person is the same variable person as in the main
        // console display: 4. Person is : Person{name='pippo'}

        person = new Person("Fede");
        // when we do this, person is a new variable - is no longer the same person as in the main
        // this variable person has THIS scope - basically the address is copied but the variables are different

        System.out.println("3. Person is : " + person);
        // console display
        // 3. Person is : Person{name='Fede'}

        person.setName("pluto");
        // now this person is the person variable in the current scope, so this is changing the name of the
        // variable person set in 3.
        // console displays
//        3. Person is : Person{name='Fede'}
//        7. Person is : Person{name='pluto'}
//        4. Person is : Person{name='pippo'}

        System.out.println("7. Person is : " + person);

    }

}
