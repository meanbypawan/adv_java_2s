class Student{
    private Integer id;
    private String name;
    private Integer age;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return id+"  "+name+"  "+age;
    }
}
class TestMain{
    public static void main(String args[]){
        Student s = new Student();
        s.setId(100);
        s.setName("ABC");

        System.out.println(s); //
    }
}