public class Grocery {

private String name;


public Grocery(String name) {
    this.name = name;
    
}

public String getName() {
    return name;
}



public boolean equals(Object comparison) {
    
    // if the variables share the same address, they are equal
    if (this == comparison) {
        return true;
    }

    // if the compared item is not of type ,Grocery the objects are not equal
    if (!(comparison instanceof Grocery)) {
        return false;
    }

    // cast the item type comparison item
    // into a Grocery type comparisonGrocery item
    Grocery comparisonGrocery = (Grocery) comparison;

    return this.name.equals(comparisonGrocery.name);
}
}
