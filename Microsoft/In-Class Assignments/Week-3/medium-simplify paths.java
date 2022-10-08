class Solution {
    public String simplifyPath(String path) {
        Stack <String> ns=new Stack<String>();
        String []arr=path.split("/");
        String a="";
        for(int i=0;i<arr.length;i++){
          if(!ns.isEmpty() && arr[i].equals("..")){
              ns.pop();
          }  
          if(!arr[i].equals(".") && !arr[i].equals("..") && !arr[i].equals("")){
              ns.push(arr[i]);
          }
          
        }if(ns.isEmpty()){
             return "/" ;
          }
        while(!ns.isEmpty()){
            a="/"+ns.pop()+a;
        }
        return a;
    }
}
