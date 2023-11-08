package org.acme;

import org.acme.domain.Person;

import org.kie.kogito.rules.DataSource;

import org.kie.kogito.rules.DataStore;

import org.kie.kogito.rules.RuleUnitData;

public class PersonUnit implements RuleUnitData {

    private DataStore<Person> personUnit = DataSource.createStore();

    private int adultAge;

    public PersonUnit() {
       
        this(DataSource.createStore());
    }
   

    public PersonUnit(DataStore<Person> personUnit) {
         System.out.println("personUnit 1");
        this.personUnit = personUnit;
    }

    public DataStore<Person> getPersonUnit() {
         System.out.println("personUnit 2");
        return personUnit;
    }

    public void setPersonUnit(DataStore<Person> personUnit) {
         System.out.println("personUnit 3");
        this.personUnit = personUnit;
    }

    public int getAdultAge() {
         System.out.println("personUnit 4");
        return adultAge;
    }

    public void setAdultAge(int adultAge) {
         System.out.println("personUnit 5");
        this.adultAge = adultAge;
    }

    //getters and setters omitted

}
