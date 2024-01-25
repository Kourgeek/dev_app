import java.util.ArrayList;
import java.util.List;

public class Medicine implements Observed{
    static int _amount;
    List<Subscriber> subscribers = new ArrayList<>();
    public void printMedInfo(){
        System.out.println("Medicine created");
    }

    public static int get_amount() {
        return _amount;
    }

    public static void set_amount(int _amount) {
        Medicine._amount = _amount;
    }

    public void changeAmount(int value){
        Medicine._amount = value;
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add((Subscriber) observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove((Subscriber) observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: subscribers) {
            observer.handler(this._amount);
        }
    }
}
