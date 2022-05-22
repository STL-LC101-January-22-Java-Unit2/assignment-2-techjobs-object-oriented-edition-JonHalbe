package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode () { return Objects.hash(id, value); }

    public String getValue() { return value; }

    public void setValue ( String value ) { this.value = value; }

    public int getId () { return id; }


}

