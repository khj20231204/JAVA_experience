package hashset.ex;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
    public static void main(String[] args){

        Person p1 = new Person("abc",13);
        Person p2 = new Person("abc",14);
        Person p3 = new Person("abc",15);
        Person p4 = new Person("efg",13);

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);

        for(Person p : personSet){
            System.out.println(p.toString());
        }

        System.out.println("==================");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("-- equals ----");
        if(obj instanceof Person){
            Person p = (Person) obj;
            System.out.println("this.age:"+this.age);
            System.out.println("obj.age:"+p.age);
            //if(p.name.equals(this.name)) return true;  //name check
            if(p.age == this.age) return true;  //age check
            //if(p.name.equals(this.name) && p.age == this.age) return true;  //name and age check
        }else return false;

        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();  //name save
        //return age;  //age save
        //return (name + age).hashCode(); //naem and age save
    }
    @Override
    public String toString(){
        return name + ":" + age;
    }
}

