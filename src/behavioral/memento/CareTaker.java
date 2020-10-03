package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    void add(Memento state){
        mementoList.add(state);
    }

    Memento get(int index){
        return mementoList.get(index);
    }
}
