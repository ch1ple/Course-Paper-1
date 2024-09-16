public class EmployeesFullName {
    private String name;
    private String surName;
    private String patronymic;

    public EmployeesFullName(String name, String surName, String patronymic) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        return name + " " + surName + " " + patronymic;
    }
}
