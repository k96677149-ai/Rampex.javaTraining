package Day_9.Class_task;

public class big_name {

    public static void main(String[] args) {
        int maxlength = 0;
        String n = "";
        String[] name = new String[]{"ramesh", "kishore", "ramya", "priya"};

        for (int i = 0; i < name.length; ++i) {
            if (name[i].length() > maxlength) {
                maxlength = name[i].length();
            }

            if (name[i].length() == maxlength) {
                n = name[i];
            }
        }

        System.out.println(n);
        System.out.println(maxlength);
    }
}
