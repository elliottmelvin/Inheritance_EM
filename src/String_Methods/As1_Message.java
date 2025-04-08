package String_Methods;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;
    private String trimmed;
    private int colonIndex;
    private String fullMessage;
    private String justKey;

    public As1_Message(String i){
        fullMessage = i;
        trimmed = i.trim();
        colonIndex = trimmed.indexOf(":");
       machineType = trimmed.substring(0, colonIndex - 1);
       machineId = trimmed.substring(colonIndex - 1, colonIndex);
       warning = trimmed.substring(colonIndex + 2);

//        justKey = i;
//        justKey.replaceAll(machineType, " ");
//        justKey.replaceAll(machineId, " ");
//        justKey.replaceAll(warning, " ");
//        justKey = justKey.trim();

    }

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

    public void printMe() {
        System.out.println(machineType + "___" + machineId + "___" + warning + ".");
    }

    public boolean scanWarning(String keyword){
        System.out.println(fullMessage.charAt(fullMessage.indexOf(keyword) - 1));
        if(fullMessage.contains(keyword)){
            if((fullMessage.indexOf(keyword) == 0) && (fullMessage.charAt(keyword.length() + 1) == (' '))){
                return true;
            }
            else if((fullMessage.indexOf(keyword) + keyword.length() == fullMessage.length()) && (fullMessage.charAt(fullMessage.length() - keyword.length() - 1) == (' '))){
                return true;
            }

            else if((fullMessage.charAt(fullMessage.indexOf(keyword) - 1) == (' ')) && (fullMessage.charAt(fullMessage.indexOf(keyword) + keyword.length() + 1) == (' '))){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
