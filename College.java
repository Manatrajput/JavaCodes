interface Student {

    void name();

    void course();
}

class College implements Student {

    public void name() {

        System.out.println("Name: Mannat");
    }

    public void course() {

        System.out.println("Course: B.Tech");
    }

    public static void main(String args[]) {

        College c = new College();

        c.name();
        c.course();
    }
}