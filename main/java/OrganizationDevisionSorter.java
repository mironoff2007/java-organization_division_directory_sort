import java.util.TreeSet;

class OrganizationDivisionSorter {


    private TreeSet<String> divisions= new TreeSet<>();

    public OrganizationDivisionSorter(String [] arr){
        getMainDepartments(arr);
    }

    private void getMainDepartments(String[] arr){
        for (String s:arr)
            if (s.contains("\\")) divisions.add(s.split("\\\\")[0]);
            else divisions.add(s);
        System.out.println();
    }

    public void printAll(){
        divisions.forEach(System.out::println);
    }
}
