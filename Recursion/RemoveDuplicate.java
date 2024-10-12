package Recursion;

public class RemoveDuplicate {
    public static void removeDuplicate(String str, int ind,StringBuilder newStr,boolean map[]){
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar= str.charAt(ind);
        if(map[currChar-'a']== true){
          //duplicate
            removeDuplicate(str, ind+1,newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str,ind,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);

    }
}
