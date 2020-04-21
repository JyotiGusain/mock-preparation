package com.mock.preparation.immutable;

import java.util.Objects;

public final class Schooldetail {
    private String nameoftheschool;
    private String Addressoftheschool;
    private int classid;

    public Schooldetail(String nameoftheschool, String addressoftheschool, int classid) {
        this.nameoftheschool = nameoftheschool;
        Addressoftheschool = addressoftheschool;
        this.classid = classid;
    }

    public String getNameoftheschool() {
        return nameoftheschool;
    }

    public String getAddressoftheschool() {
        return Addressoftheschool;
    }

    public int getClassid() {
        return classid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schooldetail that = (Schooldetail) o;
        return classid == that.classid &&
                Objects.equals(nameoftheschool, that.nameoftheschool) &&
                Objects.equals(Addressoftheschool, that.Addressoftheschool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameoftheschool, Addressoftheschool, classid);
    }
}
