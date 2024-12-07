package Day_24_Methods;

public class Email {
    public static void buildEmail(String fullName, String domain){
        String result = fullName.charAt(0) + fullName.substring(fullName.indexOf(" ")+1) + "@" + domain;
    }
    public static void main(String[] args) {
        String fullName = "tom Jerry";
        String domain = "Gmail.com";
        //fullName.charAt(0) + fullName.substring(fullName.indexOf(" ")+1) + "@" + domain;

        buildEmail(fullName, domain);
    }

}
