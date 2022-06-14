

public class ArraysExercises {

    public static Person[] addPerson(Person newPerson, Person[] persons){
        Person[] newPersonArray;
        newPersonArray = new Person[persons.length + 1];
        for(int i = 0; i < persons.length; i++) {
            newPersonArray[i] = persons[i];
        }
        newPersonArray[newPersonArray.length - 1] = newPerson;

        return newPersonArray;
    }

    public static void main(String[] args) {
        Person[] persons;
        persons = new Person[3];
        persons[0] = new Person("Michaelangelo");
        persons[1] = new Person("Donatello");
        persons[2] = new Person("Rafael");

        for(Person person: persons) {
            person.sayHello();
        }

        Person[] newPersonsArray = ArraysExercises.addPerson(new Person("Rene"),persons);
        for (Person person: newPersonsArray) {
            person.sayHello();
        }
    }

}
