package mutableAndImmutable;

public final class ImmutableStudent1 {
    private final int id;
    private final String name;
    private final Age age;
    public ImmutableStudent1(int id, String name, Age age) {
    this.name = name;
    this.id = id;
    this.age = age;
    }
//    public ImmutableStudent1(int id, String name, Age age) {
//        this.name = name;
//        this.id = id;
//        Age cloneAge = new Age();
//        cloneAge.setDay(age.getDay());
//        cloneAge.setMonth(age.getMonth());
//        cloneAge.setYear(age.getYear());
//        this.age = cloneAge;
//    }
    public int getId() {     return id;     }
    public String getName() {    return name;     }
//    public Age getAge() {    return age;     }
    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}
