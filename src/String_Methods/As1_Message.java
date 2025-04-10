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
        if(fullMessage.contains(keyword)){
            int keyIndex = fullMessage.indexOf(keyword);
            int numSub = -1;
            int numAdd = 1;

            if(keyIndex == 0){
                numSub = 0;
            }
            if(keyIndex + keyword.length() == fullMessage.length()){
                numAdd = 0;
            }

            String foundKey = fullMessage.substring(keyIndex + numSub, keyIndex + keyword.length() + numAdd);

            System.out.println(foundKey.trim());
            if(foundKey.trim().equals(keyword)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
