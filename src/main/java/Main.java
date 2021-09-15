public class Main {
  public static void main(String[] args){
    Student chloe = new Student("Chloé", "Buttigieg");
    Student marius = new Student("Marius", "Thorre");
    marius.addResult("Programmation 2", new Grade("ABS"));
    marius.addResult("Structures discrètes", new Grade("ABS"));
    chloe.addResult("Programmation 2", new Grade(13.0));
    chloe.addResult("Structures discrètes", new Grade(12.0));
    Cohort infoCohort = new Cohort("L2 informatique");
    infoCohort.addStudent(marius);
    infoCohort.addStudent(chloe);
    infoCohort.printStudentsResults();
  }
}
