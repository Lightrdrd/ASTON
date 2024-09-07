public class Park {
    private String attraction;
    private String time;
    private double price;

    public Park(String attraction, String time, double price){
        this.attraction = attraction;
        this.time = time;
        this.price = price;
    }
//Метод по выводу информации по аттракциону
    public void info() {
        System.out.println("Name attraction: "+this.attraction +"\n"+ "Time of work: "+ this.time +"\n" +"Price: "+this.price);
    }

}