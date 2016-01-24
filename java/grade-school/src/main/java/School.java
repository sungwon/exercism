import java.util.*;

/**
 * Created by sungwon on 1/8/16.
 */
public class School {

    private Map<Integer,List<String>> studentDb;

    public School() {
        studentDb = new TreeMap<>();
    }

    public Map<Integer,List<String>> db() {
        return studentDb;
    }

    public void add(String name, int grade) {
        List students = grade(grade);
        students.add(name);
        studentDb.put(grade, students);
    }

    public List grade(int grade) {
        return studentDb.getOrDefault(grade, new ArrayList<String>());
    }

    public Map sort() {

        for (List list: studentDb.values()) {
            Collections.sort(list);
        }

        return db();
    }


}
