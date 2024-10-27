package binus;

import binus.Course;

public class MainClass {

    //Relationship is a design concept, not a programming technique.

    //Association
    //symbol = straight line (garis lurus)
    //each class involved in an association, with multiplicity:
    //the general rule is m..n , which means at least m, but no more than n instances
    //asterisk * only can be used for substitute n, e.g m..* which means more than m

    //Aggregation
    //Aggregation is a special form of association, represents an ownership relationship between two objects
    //symbol = straight line with diamond at the end (Class A (aggregated class) ------<>Class B (Aggregating class))
    //In this case, Class A is called Aggregated class and Class B is called Aggregating class
    //By doing this, only have to make object in Class B (disini di course)
    //aggregating can exist >1  


    //Composition
    //Symbol = straight line with filled diamond at the end (Class A --------<filled>Class B)
    //Unlike aggregation, composition can't have >1 aggregating class)
    //tidak boleh lebih dari 1 objek -> multiplicity di aggregator pasti 1
    //aggregating class cannot exist w/o aggregator e.g (Hand--<filled>Person<filled>--Leg)
    



    //Aggregation and composition are subsets of Association.

    


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
