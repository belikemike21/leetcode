class Solution {
    public String defangIPaddr(final String address) {
        final StringBuilder sb = new StringBuilder();

        for (final char ch : address.toCharArray()) {
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}