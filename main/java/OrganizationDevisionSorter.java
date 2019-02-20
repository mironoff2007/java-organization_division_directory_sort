import java.util.Comparator;
import java.util.TreeSet;

class OrganizationDivisionSorter {

    class TreeComparator implements Comparator<String> {


        @Override
        public int compare(String o1, String o2) {

            //main division
            String s1;
            if(o1.indexOf('\\')>0){s1=o1.substring(0,o1.indexOf('\\'));}
            else s1=o1;

            String s2;
            if(o2.indexOf('\\')>0){s2=o2.substring(0,o2.indexOf('\\'));}
            else s2=o2;

            //hierarchy length
            int l1= (int) o1.chars().filter(ch->ch=='\\').count();
            int l2= (int) o2.chars().filter(ch->ch=='\\').count();

            //compare by main division
            if(s1.equals(s2)){
                //compare by hierarchy length
                if(l1==l2){
                    //compare by name
                    if(o2.equals(o1)){return 0;}
                    else return o2.compareTo(o1);
                }
                else return l1-l2;
            }
            else{return s2.compareTo(s1);}
        }
    }

    private TreeSet<String> divisions= new TreeSet<>(new TreeComparator());


    public OrganizationDivisionSorter(String [] arr){
        AddAllDepartments(arr);
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

    public String [] getDivisionsArray() {
        return  divisions.toArray(new String[divisions.size()]);
    }
}
