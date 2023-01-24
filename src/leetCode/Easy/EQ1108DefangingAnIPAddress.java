package leetCode.Easy;

public class EQ1108DefangingAnIPAddress {
    /*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
     */
    public static String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        System.out.println(address);
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
/*
Other Solutions:
  public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            sb.append(c == '.' ? "[.]" : c);
        }
        return sb.toString();
    }
 */