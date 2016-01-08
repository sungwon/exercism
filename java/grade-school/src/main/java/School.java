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
        List students;
        if ((students=grade(grade)) == null) {
            students = new ArrayList<String>();
        }
        students.add(name);
        studentDb.put(grade, students);
    }

    public List grade(int grade) {
        List students = studentDb.get(grade);
        return students == null ? new ArrayList<String>() : students;
    }

    public Map sort() {

        for (List list: studentDb.values()) {
            Collections.sort(list);
        }

        return db();
    }


}
