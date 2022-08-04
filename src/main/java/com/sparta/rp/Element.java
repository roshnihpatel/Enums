package com.sparta.rp;

public enum Element {
    HYDORGEN("hydrogen", 1),
    HELIUM("helium", 2),
    LITHIUM("lithium", 3),
    BORON("boron", 4),
    CARBON("carbon", 5),
    NITROGEN("nitrogen", 6),
    OXYGEN("oxygen", 7),
    ;

    Element(String name, int atomicNumber) {
        this.name = name;
        this.atomicNumber = atomicNumber;
    }



    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    private String name;
    private int atomicNumber;


    public String print() {
        return "Element{" +
                "name='" + name + '\'' +
                ", atomicNumber=" + atomicNumber +
                '}';
    }



}
