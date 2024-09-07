public class employee {
    //Создание полей: Фио, должность, емаил, телефон, зарплата и возраст
    private String fio;
    private String jobTitle;
    private String email;
    private String phone ;
    private int salary;
    private int age;

//Заполнение полей значениями
  public employee(String fio, String jobTitle, String email, String phone, int salary, int age){
        this.fio = "Ivanov Ivan Ivanovich";
        this.jobTitle = "welder";
        this.email = "yarkoslepit@mail.ru";
        this.phone = "2020327";
        this.salary = 500;
        this.age = 25;
    }

//Вывод информации об объекте в консоль
    void printEmployeeInfo() {
        System.out.println("FIO: " + fio+"\n" + "Job Title: " + jobTitle +"\n" + "Email: " + email +"\n" + "Phone: " + phone +"\n" + "Salary: " + salary +"\n" + "Age: " + age );
    }






}
