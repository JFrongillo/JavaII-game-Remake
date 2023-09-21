public class GameUtilities {
    /*
    * A class that containes utility methods in the game
    */ 
    public String randomString(int length){
        String str = "";
        for(int i = 0; i < length; i++){
            str += (char)((int)(Math.random() * 26) + 97);
        }
        return str;
    }
}
