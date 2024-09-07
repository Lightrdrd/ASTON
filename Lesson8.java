public class Lesson8 {
    public static void main(String[] args) {
        //Объявляем массив обьектов
        employee[] persArray = new employee[5];
        //Для каждой ячейки массива задаем объект
        persArray[0] = new employee("Petrov Petr", "Qa", "qapetr@mail.ru","375291112233" ,1000, 19);
        persArray[1] = new employee("Semenov semen", "Head of QA", "tsarvodvorca@mail.ru","375292222222" ,9999, 45);
        persArray[2] = new employee("Evdokimova Lisa", "HR", "hrlisa@mail.ru","375293333333" ,2000, 18);
        persArray[3] = new employee("Egorov Egor", "Soft Engineer", "shtorka-egorka@mail.ru","375331234566" ,6000, 38);
        persArray[4] = new employee("Vasiljeva Vasilisa", "CEO", "bigfckboss@mail.ru","375297777777" ,999999, 35);
    }
}
