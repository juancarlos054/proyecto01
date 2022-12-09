public class Class2 {
    private int i;

    public void set_i(int i){
        this.i = i;
    }

    public Class2(int i){
        this.i = i;
        if (this.i != 1){
            System.out.println("error!");
        }
    }

}
