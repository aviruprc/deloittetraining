package Dbois;

public class People {

	private Person[] persons;
	int pers =5;
	int counter =0;
	
	public People () {
		persons = new Person[pers];
	}
	
	public void addPerson (Person p) {
	if(counter<pers) {
		persons[counter++] = p;
		}
	}
	
	public void displayPersons() {
		for (Person p : persons) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		People ppl = new People ();
		Person amit =  new Person ("amit",414561364L);
		Person asha = new Person ("whou", 962437692L);
		ppl.addPerson(amit);
		ppl.addPerson(asha);
		ppl.displayPersons();

	}

}