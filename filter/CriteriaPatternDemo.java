/**
* PatternType: Structual
**/
import java.util.List;
import java.util.ArrayList;
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));


    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemale();
    Criteria single = new CriteriaSingle();
    Criteria singleMale = new AndCriteria(single, male);
    Criteria singleOrFemale = new OrCriteria(single, female);

    System.out.println("Males: ");
    printPersons(male.meetCriteria(persons));

    System.out.println("Females: ");
    printPersons(female.meetCriteria(persons));

    System.out.println("SingleMale: ");
    printPersons(singleMale.meetCriteria(persons));

    System.out.println("SingleOrFemale: ");
    printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
    
        for (Person person: persons){
            System.out.println("\t" + person.toString());
        }
    }

}
