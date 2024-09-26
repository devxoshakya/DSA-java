package Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<String>();
        subSeq("","abccabc",res);
        System.out.println(res);
    }

    static void subSeq(String p, String up, ArrayList<String> res){
        if(up.isEmpty()){
            if (p=="") {
                return;
            }
            res.add(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1),res);
        subSeq(p, up.substring(1),res);
    }
}
