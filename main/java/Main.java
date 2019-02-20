
public class Main {


        public static void main(String[] args)
        {
            String s="“K1\\SK1”\n" +
                    "“K1\\SK2”\n" +
                    "“K1\\SK1\\SSK1”\n" +
                    "“K1\\SK1\\SSK2”\n" +
                    "“K2”\n" +
                    "“K2\\SK1\\SSK1”\n" +
                    "“K2\\SK1\\SSK2”\n”" +
                    "“K2\\SK1\\SSK2";
            s=s.replaceAll("“","");
            s=s.replaceAll("”","");
            String [] arr=s.split("\n");
            OrganizationDivisionSorter sorter=new OrganizationDivisionSorter(arr);
            sorter.printAll();
            

        }
    }



