class TestMain{
    public static void main(String args[]){
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1 == i2);
    }
}