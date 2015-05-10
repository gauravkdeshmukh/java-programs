import java.util.Arrays;

public class GiftSorter{
  public String sortGiftCode(String code){
    char [] charArray = code.toCharArray();
    Arrays.sort(charArray);
    String sortedString = new String(charArray);
    return sortedString;    
  }
}
