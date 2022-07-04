package packagecom.company;

import java.util.ArrayList;
import java.util.List;

public class TodoListManager {
    private List<String> pList = new ArrayList<>();

    public List<String> getList() {
        return pList;
    }

    public void add(String task) {
        pList.add(task);
    }
}
