import java.util.Collections;
import java.util.TreeSet;

class OrganizationDivisionSorter {


    private TreeSet<String> divisions= new TreeSet<>();

    public OrganizationDivisionSorter(String [] arr){
        AddAllDepartments(arr);
    }

    private void getMainDepartments(String[] arr){
        for (String s:arr)
            if (s.contains("\\")) divisions.add(s.split("\\\\")[0]);
            else divisions.add(s);

    }
    private void AddAllDepartments(String[] arr){

        for (String s:arr)
            if (s.contains("\\")) {
                divisions.add(s);

                int ind;
                while ((ind=s.lastIndexOf("\\"))>0){
                    s=s.substring(0,ind);
                    divisions.add(s);
                }
            }

            else divisions.add(s);

    }


    public void printAll(){
        divisions.forEach(System.out::println);
    }
}
