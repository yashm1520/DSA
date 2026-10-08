package String;

public class zigzag {
	 public String convert(String s, int numRows) {
         if(numRows==1){
            return s;
        }
           StringBuilder[] rows=new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
        rows[i] = new StringBuilder();
        }
        int row=-1;
        boolean goingDown=true;
        int top=0;
        int bottom=numRows-1;

        for(int i=0;i<s.length();i++){
          if(goingDown){
            row++;
          }else{
            row--;
          }
          rows[row].append(s.charAt(i));

          if(row==bottom){
            goingDown=false;
          }
           if(row==top){
            goingDown=true;
          }
        }
        s="";
        for(int i=0;i<rows.length;i++){
           s+=rows[i].toString(); 
        }
        return s;
    }
}
