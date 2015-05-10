public class JadenCase {

  public String toJadenCase(String phrase) {
    // TODO put your code below this comment
      String[] words = phrase.split(" ");
      StringBuilder ret = new StringBuilder();
    if( phrase==null || phrase=="")
      return null;
    else{
    for(int i = 0; i < words.length; i++) {
        ret.append(Character.toUpperCase(words[i].charAt(0)));
        ret.append(words[i].substring(1));
        if(i < words.length - 1) {
            ret.append(' ');
        }
    }
}   
return ret.toString();
  }
}
