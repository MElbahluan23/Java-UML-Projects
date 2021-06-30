
public class Check {
        public static void main(String [] args) {
            String[] StrArr ={"Maro","#FSd","Emad Hassan","Amr","M@ZEN"};
            for (String data : StrArr)
            {
                if(isAlphabets(data)==true){

                    System.out.println("{"+data+"}"+" --->>>> Contain only Letters");
                }
                else{System.out.println("{"+data+"}"+"  --->>>> Have Special characters");}


            }
        }



        public static boolean isAlphabets(String data)
        {

            char[] chars = data.toCharArray();
            for (char c: chars){
                if (!Character.isLetter(c)){

                    return false;
                }


            }
            return true;
        }


    }


