package concepts;

import java.util.Observable;
import java.util.Observer;

class DataSource extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }
}

class DataListener implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DataSource) {
            System.out.println("Data has changed: " + ((DataSource) o).getValue());
        }
    }
}

public class ObservableAnaObserver {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        DataListener listener = new DataListener();
        dataSource.addObserver(listener);
        dataSource.setValue(10);
    }
}
