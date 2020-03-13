package task1;

public class Main {
    public static void main(String[] args) {
        User tester = new User(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class User {
    private long id;
    private Vacancy vacancy;

    public User(long id, String vacancy){
        this.id = id;
        this.vacancy = new Vacancy(vacancy);
    }

    String getVacancy(){
        return vacancy.getVacancy();
    }

    public long getId(){
        return id;
    }
}

class Vacancy {
    private String name;

    public Vacancy(String name){
        this.name = name;
    }

    String getVacancy(){
        return name;
    }
}
