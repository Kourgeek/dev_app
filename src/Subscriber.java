public class Subscriber implements Observer{

    @Override
    public void handler(int amount) {
        if (amount!=0) {
            System.out.println("Теперь на складе: " + amount + " штук\n");
        } else {
            System.out.println("Дозакажите товар, в наличии " + amount + " штук \n");
        }
    }
}
