package OOPs;

public class akshita {
    public int val;
    public akshita next;

    public akshita(int val){
        this.val = val;
        this.next = null;
    }

    public akshita(int val, akshita next){
        this.val = val;
        this.next = next;
    }

    public akshita(){
        this.val = 0;
        this.next = null;
    }
}
